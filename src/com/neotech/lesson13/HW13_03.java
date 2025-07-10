package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class HW13_03 extends CommonMethods{

	public static void main(String[] args) {
		try {
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
			
			sendText(driver.findElement(By.id("first-name-box")), "Jane");
			sendText(driver.findElement(By.id("last-name-box")), "Doe");
			
			//Wait for employee details to show
			//Click on the employee image
			WebElement img = driver.findElement(By.xpath("//label[@id='photo-preview-lable']//img"));
			WebElement input = driver.findElement(By.id("employeePicture"));
			String filePath = System.getProperty("user.dir")+"/screenshots/Lesson13/img.jpg";
			
			
			//Upload an image in the employee photo
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.display = 'block';", input);
			input.sendKeys(filePath);
			
			
			tenSec();
			tenSec();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			tearDown();
		}

	}

}
