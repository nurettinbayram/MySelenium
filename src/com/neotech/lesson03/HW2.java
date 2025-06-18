package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Homework 1: Using css Selector ONLY TC 2: Mercury Tours Registration: Open chrome
		 * browser Go to “http://demo.guru99.com/test/newtours/” Click on Register Link
		 * Fill out all required info Click Submit User successfully registered
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.cssSelector("a[href='register.php']")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("nurettin");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("bayram");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("852 252 25 25");
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("nurettin@gmail.com");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("Selenium St.");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("NYC");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("NY");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("12548");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("nurettinbayram");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("253698");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("253698");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		
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
