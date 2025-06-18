package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	// go to https://facebook.com/
	// fill out the username
	// fill out the password

	// click on login
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new ChromeDriver();

		// navigate to facebook.com
		driver.get("https://facebook.com");

		// locate the username box

		// Create a WebElement object
		WebElement usernameBox = driver.findElement(By.id("email"));
		// send the username to username box
		usernameBox.sendKeys("neo@tech.com");

		Thread.sleep(2000);

		// locate the password box
		driver.findElement(By.id("pass")).sendKeys("p@ssword!");

		Thread.sleep(2000);

		// locate the submit button
		driver.findElement(By.name("login")).click();

		Thread.sleep(5000);

		driver.quit();
	}

}
