package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {

		//We do not need to add JAR files for each class. We already have 
		//them in the project build path now. 
		
		//In Selenium WebDriver 4, Selenium will manage downloading the 
		//required driver for any browser. 
		// (in older versions we had to do that in code)
		
		
		//So what are the steps to follow on a test???
		
		//1. Open the Firefox Browser 
		WebDriver driver = new FirefoxDriver();
		
		//2. Go to the URL where the test will be done
		driver.get("https://www.neotechacademy.com/");
		
		//We can pause the execution at any point we want 
		Thread.sleep(2000);
		
		//3. Perform this test: 
			//Get the current URL and check if it is the same as this: https://www.neotechacademy.com/ 
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.neotechacademy.com/";
		
		if(actualURL.equals(expectedURL))
		{
			System.out.println("Page Title: " + driver.getTitle());
		}
		else
		{
			System.out.println("The URL is wrong!!!");
		}
		
		//pause for 2 second here
		Thread.sleep(2000);
		
		//4. Quit the browser
		driver.quit();
		
		
	}

}
