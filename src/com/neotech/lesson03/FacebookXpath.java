package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookXpath {
	/*
	 * TC 1: Facebook login: Open chrome browser Go to "https://www.facebook.com/"
	 * Enter valid username and valid password and click login User successfully
	 * logged in
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("nurettin");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("12546");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		
		Thread.sleep(5000);
		
		

	}

}
