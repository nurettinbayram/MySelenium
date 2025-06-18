package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
	/*
	 * 
	 * Open chrome browser
		Go to "https://www.facebook.com/"
		Click on Sign Up link
		Enter first name
		Enter last name
		Enter email address
		Re-enter email address
		Click on Sign Up button
	 */

	public static final String url = "https://www.facebook.com";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.linkText("Create new account")).click();

		Thread.sleep(2000);

		// fill out the form
		driver.findElement(By.name("firstname")).sendKeys("Alaric");
		driver.findElement(By.name("lastname")).sendKeys("Garcia");
		driver.findElement(By.name("reg_email__")).sendKeys("alaric@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("alaric@neo");

		Thread.sleep(5000);

		// click on the submit button
		driver.findElement(By.name("websubmit")).click();

		Thread.sleep(3000);

		driver.quit();

	}

}
