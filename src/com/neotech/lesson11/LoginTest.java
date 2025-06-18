package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

//https://hrm.neotechacademy.com
public class LoginTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		// send the username
		WebElement username = driver.findElement(By.id("txtUsername"));
		// username.clear();
		// username.sendKeys(ConfigsReader.getProperty("username"));
		sendText(username, ConfigsReader.getProperty("username"));

		// send the password
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));

		// wait for 3 seconds
		wait(3);

		// click on the login button
		WebElement loginBtn = driver.findElement(By.xpath("//button"));
		loginBtn.click();

		wait(3);

		// lets verify that we were able to login successfully
		WebElement smallLogo = driver.findElement(By.id("ohrm-small-logo"));

		if (smallLogo.isDisplayed()) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!!!");
		}

		wait(3);

		tearDown();

	}

}
