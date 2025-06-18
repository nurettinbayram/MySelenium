package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * Homework 1: Using xPath ONLY TC 2: Mercury Tours Registration: Open chrome
		 * browser Go to “http://demo.guru99.com/test/newtours/” Click on Register Link
		 * Fill out all required info Click Submit User successfully registered
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.xpath("//a[@href='register.php']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("nurettin");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("bayram");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("252 363 98 54");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("nurettin@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Selenium st.");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("NYC");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("NY");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("11125");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nurettinbayram");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("11253");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("11253");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		String expectedURL = "https://demo.guru99.com/test/newtours/register_sucess.php";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL + " " + expectedURL);
		if(actualURL.equals(expectedURL)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		

	}

}
