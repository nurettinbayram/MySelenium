package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	/*
	 * Open chrome browser
		Go to "https://demo.guru99.com/test/newtours/"
		Click on Register Link
		Fill out ALL required info
		Click Submit
		User successfully registered
		(Create the script using different locators)
	 */

	public static final String url = "https://demo.guru99.com/test/newtours";

	public static void main(String[] args) throws InterruptedException {
		// create a webdriver object for the browser interaction
		WebDriver driver = new ChromeDriver();

		// go to the url
		driver.get(url);

		// locate the Register link
		driver.findElement(By.partialLinkText("REGIS")).click();

//		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
//		registerLink.click();

		Thread.sleep(2000);

		// lets fill out the form
		driver.findElement(By.name("firstName")).sendKeys("Joost");
		driver.findElement(By.name("lastName")).sendKeys("Vagt");
		driver.findElement(By.name("phone")).sendKeys("555 444 3323");
		driver.findElement(By.id("userName")).sendKeys("joost@gmail.com");

		// fill in the address info
		driver.findElement(By.name("address1")).sendKeys("123 Main St");
		driver.findElement(By.name("city")).sendKeys("NYC");
		driver.findElement(By.name("state")).sendKeys("NY");
		driver.findElement(By.name("postalCode")).sendKeys("09334");

		// fill in the user info
		driver.findElement(By.id("email")).sendKeys("joost");
		driver.findElement(By.name("password")).sendKeys("123@abc");
		;
		driver.findElement(By.name("confirmPassword")).sendKeys("123@abc");

		// submit the form
		driver.findElement(By.name("submit")).click();

		Thread.sleep(2000);

		// lets verify the registration
		String successfulRegistrationUrl = "https://demo.guru99.com/test/newtours/register_sucess.php";
		String actualUrl = driver.getCurrentUrl();

		if (successfulRegistrationUrl.equals(actualUrl)) {
			System.out.println("Registration test was successful");
		} else {
			System.out.println("Test failed!!!");
		}

		driver.quit();
	}

}
