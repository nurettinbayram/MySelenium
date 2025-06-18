package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends BaseClass {
	/*
	 * TC 2: Orange HRM Application Negative Login: 
		Open Chrome browser
		Go to https://hrm.neotechacademy.com/
		Enter valid username
		Leave password field empty
		Verify error message with text "Password cannot be empty" is displayed.
	 */
	public static void main(String[] args) throws Exception {

		setUp();

		String username = ConfigsReader.getProperty("username");
		String password = "";

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

		driver.findElement(By.cssSelector("button[type='submit']")).click();

		Thread.sleep(3000);

		WebElement errorMsg = driver.findElement(By.id("txtPassword-error"));

		// check the errorMsg in page
		if (errorMsg.isDisplayed()) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!!!");
		}

		tearDown();
	}

}
