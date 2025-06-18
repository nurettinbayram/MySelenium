package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW01_02 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * HW2: Opening Page on Firefox Browser Open Firefox browser Navigate to
		 * “https://www.redfin.com/” Verify that you have navigated to
		 * (https://www.redfin.com/) End the Session (close the browser).
		 */
		
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.redfin.com/");
		
		Thread.sleep(2000);
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.redfin.com/";
		
		if(actualURL.equals(expectedURL)) {
			System.out.println("Test PASSED!");
		}
		else {
            System.out.println("Test FAILED!");
            System.out.println("Expected URL: " + expectedURL);
            System.out.println("Actual URL: " + actualURL);
        }
		
		
		
		driver.quit();
	}

}
