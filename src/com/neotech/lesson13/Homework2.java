package com.neotech.lesson13;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends CommonMethods {

	public static void main(String[] args) {
		
		/*
		Go to https://hrm.neotechacademy.com/
		Log in using our custom methods
		Go to PIM menu
		Add an employee
		Go to Employee List
		Get the list of the employees (Using tables - tr and td) 
		Loop to search for the employee you added
		When you find the employee - click on it.
		Take a screenshot
		 */
		
		
		setUp();
		
		//Login
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button")));
		
		
		//Navigate to PIM
		click(driver.findElement(By.id("menu_pim_viewPimModule")));
		
		//Click on Add Employee
		click(driver.findElement(By.linkText("Add Employee")));
		
		//Add employee data
		
		
		
		//Probably we might have to wait here!!!!
		
		sendText(driver.findElement(By.id("first-name-box")), "Jane");
		sendText(driver.findElement(By.id("last-name-box")), "Doe");
		
		//temp wait -- just added to avoid the duplicate id issue
	//	wait(5);
		
		String employeeID = driver.findElement(By.id("employeeId")).getDomProperty("value");
		System.out.println("EmployeeID: "+ employeeID);
		
		selectDropdown(driver.findElement(By.id("location")), "Canadian Development Center");
		
		wait(2);
		//click on save
		click(driver.findElement(By.id("modal-save-button")));
		
		
		waitForVisibility(By.id("firstName"));
		
		//go to Employee List
		
		click(driver.findElement(By.linkText("Employee List")));
		
		//I want to get all Employee ID's and search to find the added employee
		//Once found, I will click on it
		
		boolean found = false;
		
		while (!found)
		{
			
			List<WebElement> idList = driver.findElements(By.xpath("//table[@id='employeeListTable']//td[2]"));
			
			for (WebElement id : idList)
			{
				if (id.getText().equals(employeeID))
				{
					found = true;
					id.click();
					break;
				}
			}
			
			
			
			//If I have not found the employee yet, it is probably because its not on this page
			//so I will move to the next page and repeat the process
			
			System.out.println("Checking on the next page....");
		//	click(next page button);
			
		}
		
		//probably I should wait for the fist name to show!!!
		waitForVisibility(By.id("firstName"));
		
		//Lets take a screenshot
		
		//Prepare the camera (or opening the camera app)
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		// Take the photo
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		//Name it and save it in your folder
		try 
		{
			Files.copy(sourceFile, new File("screenshots/Lesson13/Homework2.png"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		tearDown();

	}

}
