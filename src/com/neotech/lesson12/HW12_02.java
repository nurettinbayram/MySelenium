package com.neotech.lesson12;



import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

public class HW12_02 extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * Homework 2: Go to https://hrm.neotechacademy.com/ 
		 * Log in using our custom methods 
		 * Go to PIM menu Add an employee 
		 * Go to Employee List 
		 * Get the list of the employees (Using tables - tr and td) 
		 * Loop to search for the employee you added 
		 * When you find the employee - click on it. 
		 * Take a screenshot
		 */
		try {
			setUp();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
			//Log in using our custom methods
			driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
			driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
			driver.findElement(By.xpath("//button")).click();
			threeSec();
			
			//Go to PIM menu Add an employee
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
			driver.findElement(By.xpath("//span[text()='Add Employee']")).click();
			driver.findElement(By.id("first-name-box")).sendKeys("Leonel");
			driver.findElement(By.id("last-name-box")).sendKeys("Messi");
			String id = driver.findElement(By.id("employeeId")).getDomProperty("value"); //property....
			System.out.println("EmployeeID: "+ id);
			driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
			driver.findElement(By.xpath("//span[text()='Canadian Development Center']")).click();
			threeSec();
			
			driver.findElement(By.id("modal-save-button")).click();
			
			//Explicit wait
			WebDriverWait exWait = new WebDriverWait(driver, Duration.ofSeconds(40));
			exWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
			
			//Go to Employee List 
			driver.findElement(By.xpath("//span[text()='Employee List']")).click();
			
			//Get the list of the employees (Using tables - tr and td) 
			List<WebElement> employeeId = driver.findElements(By.xpath("//table[@id='employeeListTable']//tr//td[2]"));
			
			//Loop to search for the employee you added 
			for(WebElement el : employeeId) {
				if(el.getText().equals(id)) {
					//When you find the employee - click on it. 
					el.click();
				}
			}
							
			//Take a screenshot
			TakesScreenshot ts = (TakesScreenshot)driver;
			oneSec();
			
			File soursFile = ts.getScreenshotAs(OutputType.FILE);
			oneSec();
			
			try {
				Files.copy(soursFile, new File("screenshots/HRM/Homework2.png"));
				oneSec();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
			
			fiveSec();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tearDown();
		}

	}

}