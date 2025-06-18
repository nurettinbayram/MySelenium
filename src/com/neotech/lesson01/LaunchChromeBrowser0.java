package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser0 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// WebDriver driver = new EdgeDriver();
		
		 WebDriver driver = new ChromeDriver();
		
		// WebDriver driver = new FirefoxDriver();
		
		
		//https://www.neotechacademy.com/
		/*https://www.neotechacademy.com/*/
		
		driver.get("https://www.neotechacademy.com/");
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.neotechacademy.com/";
		
		Thread.sleep(2500);
		
		if(actualURL.equals(expectedURL)) {
			System.out.println("Page Title : " + driver.getTitle());
		}else {
			System.out.println("The URL is Wrong!!!");
		}
		
		
		
		driver.quit();

	}

}
