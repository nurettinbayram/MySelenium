package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends BaseClass {
	/*
	 * HW1: Orange HRM Application Login: 
	 * Open Chrome browser 
	 * Go to https://hrm.neotechacademy.com/ 
	 * Enter valid username and password 
	 * Click on login button 
	 * Then verify that "span with id account-name" has the text
	 * "Jacqueline White". 
	 * 
	 * Quit the browser
	 */
	public static void main(String[] args) throws Exception {

		setUp();

		// here goes the test code
		String username = ConfigsReader.getProperty("username");
		String password = ConfigsReader.getProperty("password");

		System.out.println(username + " - " + password);

		// locate the web elements
		WebElement usernameBox = driver.findElement(By.id("txtUsername"));
		WebElement passwordBox = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

		// send the credentials into the boxes
		usernameBox.sendKeys(username);
		passwordBox.sendKeys(password);
		loginButton.click();

		Thread.sleep(5000);

		// find the span, verify its text value
		String expected = "Jacqueline White";
		String actual = driver.findElement(By.id("account-name")).getText();

		if (actual.equals(expected)) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!!!");
		}

		// quit the browser
		tearDown();
	}

}
