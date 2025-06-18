package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	/* 
	 *     TC 1: Facebook login: 
	        Open chrome browser
	        Go to “https://www.facebook.com/”
	        Enter valid username and valid password and click login 
	        User successfully logged in
	 */

	public static final String url = "https://www.facebook.com";

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// find the web elements using css selector
		driver.findElement(By.cssSelector("input#email")).sendKeys("neo@tech.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("123@abc");

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("button[id^='u_0']")).click();

		Thread.sleep(2000);

		driver.quit();

	}

}
