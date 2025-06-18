package com.neotech.lesson11;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		setUp();

		// login to the application
		sendText(driver.findElement(By.id("txtUsername")), "Admin");
		sendText(driver.findElement(By.id("txtPassword")), "");
		click(driver.findElement(By.xpath("//button[@type='submit']")));

		wait(5);
		
		if(!driver.getTitle().contains("Dashbord")) {

		TakesScreenshot ssDriver = (TakesScreenshot) driver;

		// lets take the screenshot using the ssDriver object
		File screenShot = ssDriver.getScreenshotAs(OutputType.FILE);

		try {
			File screenShotDir = new File("screenshots/HRM");

			// check if the directory exists
			if (!screenShotDir.exists()) {
				// create the folders
				screenShotDir.mkdirs();
			}

			File screenshotLocation = new File("screenshots/HRM/dashboard.png");
			Files.copy(screenShot, screenshotLocation);
			
		
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to take the screenshot!");
		}
		} 

		tearDown();

			
	}

}
