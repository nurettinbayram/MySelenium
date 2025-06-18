package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
	/*
	 * Open chrome browser Go to "https://demo.guru99.com/test/newtours/" Click on
	 * Register Link Fill out ALL required info Click Submit User successfully
	 * registered (Create the script using different locators)
	 */
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		WebElement register = driver.findElement(By.linkText("REGISTER"));
		register.click();
		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Nurettin");
		WebElement lastname = driver.findElement(By.name("lastName"));
		lastname.sendKeys("Bayram");
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("555 444 77 99");
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("nurettin@gmail.com");
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("5 Selenium Street");
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("New York City");
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("NY");
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		postalCode.sendKeys("11225");
		WebElement country = driver.findElement(By.name("country"));
		country.sendKeys("UNITED STATES");
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("nrttnbyrm");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123456");
		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("123456");
		WebElement submit = driver.findElement(By.name("submit"));
		Thread.sleep(15000);
		submit.click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
