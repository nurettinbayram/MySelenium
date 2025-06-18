package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW01_01 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * HW1: Amazon Page Title Verification: Open chrome browser Go to
		 * “https://www.amazon.com/” Verify Title “Amazon.com: Online Shopping for
		 * Electronics, Apparel, Computers, Books, DVDs & more” is displayed End the
		 * Session (close the browser).
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		String actualURL = driver.getTitle();
		String expectedURL = "https://www.amazon.com/";
		
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
