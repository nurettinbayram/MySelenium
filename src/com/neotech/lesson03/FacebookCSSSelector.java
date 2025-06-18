package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookCSSSelector {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: Facebook login: Open chrome browser Go to "https://www.facebook.com/"
		 * Enter valid username and valid password and click login User successfully
		 * logged in 
		 * a[href^='/ho'] 
		 * a[href$='ies']
		 * a[href*='obbi']
		 */
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("input#email")).sendKeys("nurettin@gamil.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("12546");

		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[id^='u_0_']")).click();

		Thread.sleep(5000);
		driver.quit();

	}

}
