package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

	public static String url = "https://neotech.vercel.app/sign-up";
	
	public static void main(String[] args) throws InterruptedException {
		// "https://neotech.vercel.app/sign-up"
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		//send first name
		driver.findElement(By.xpath("//input[@name='firstName']"))
		.sendKeys("Nadim");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstName']"))
		.sendKeys("Anna");
		
		
		//lets make sure we clear the last name box before we send the last name
		driver.findElement(By.xpath("//input[@id='txtLastName']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("Thurman");
		Thread.sleep(3000);
		
		
		//2nd way: No repetition, save the WebElement Object
		WebElement phone = driver.findElement(By.cssSelector("input#txtPhone"));
		phone.sendKeys("123-456-789");
		Thread.sleep(3000);
		phone.clear();
		Thread.sleep(3000);
		phone.sendKeys("321-654-987");
		Thread.sleep(3000);
		
		
		//getting the value of an attribute: 
		
		//what is the maxLength of the phone element???
		String maxLength = phone.getAttribute("maxlength"); //deprecated
		System.out.println("The value of maxlength is: " + maxLength);
		
		String maxLength1 = phone.getDomAttribute("maxlength");
		System.out.println("The value of maxlength is: " + maxLength1);
				
		//locate the country element and get its class attribute? 
		
		WebElement country = driver.findElement(By.name("country"));
		String countryClass = country.getDomAttribute("class");
		System.out.println("The class attribute of country is: " + countryClass);
		
		
		//can I get a text inside a WebElement??
		
		String headerText = driver.findElement(By.xpath("//div[@id='q19']/h2")).getText();
		System.out.println("The header is: " + headerText);
		Thread.sleep(3000);

		
		
		
		driver.quit();
		

		

	}

}
