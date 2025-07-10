package com.neotech.lesson12;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Task1 extends CommonMethods {
//	go to https://hrm.neotechacademy.com/
//	enter username
//	leave password blank
//	submit the form
//	and take a screenshot of the error page
	public static void main(String[] args) {
		setUp();

		// login to the application
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		// sendText(driver.findElement(By.id("txtPassword")),
		// ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button[@type='submit']")));

		wait(2);

		// create an object that can take screenshot
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

			File screenshotLocation = new File("screenshots/HRM/blank_password_error.png");
			Files.copy(screenShot, screenshotLocation);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to take the screenshot!");
		}

		tearDown();

	}

}
