package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		//If we want to test anything in a web application, we have to 
		//follow these steps:
		
		
		//1. Open the browser
		WebDriver driver = new ChromeDriver();

		//2. Go to the URL you want to test
		driver.get("https://www.neotechacademy.com/");
		
		//3. Do the required tests/actions
		
		//The code is very fast. As soon as the browser opens and goes to the
		//URL the browser will quit. 
		
		//to get more time to see the page we can pause the execution
		Thread.sleep(5000); //pause the execution for 5 seconds (5000 milliseconds)
		
		//4. Quit the browser
		driver.quit();
	}

}
