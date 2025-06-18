package com.neotech.lesson03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	// 1. Open chrome browser
	// 2. Navigate to “https://www.zillow.com/”
	// 3. Navigate to “https://www.google.com/”
	// 4. Navigate back to Zillow Page
	// 5. Refresh current page
	// 6. Verify url contains “Zillow”

	public static void main(String[] args) throws InterruptedException {

		// 1. Open chrome browser
		WebDriver driver = new ChromeDriver();

		// 2. Navigate to “https://www.zillow.com/”

		// 1st way: use the get() method
		// driver.get("https://www.zillow.com/"); // will not maintain the browsing
		// history

		// 2nd way: use the navigate().to() method
		driver.navigate().to("https://www.zillow.com/"); // will maintain the browsing history

		Thread.sleep(4000);

		// maximize the window
		driver.manage().window().maximize();
		// driver.manage().window().fullscreen();

		Thread.sleep(3000);

		// 3. Navigate to “https://www.google.com/”
		driver.navigate().to("https://google.com");
		Thread.sleep(3000);

		// 4. Navigate back to Zillow Page
		driver.navigate().back();

		Thread.sleep(3000);

		// 5. Refresh current page
		driver.navigate().refresh();

		Thread.sleep(3000);

		// 6. Verify url contains “Zillow”
		String url = driver.getCurrentUrl();
		if (url.contains("zillow")) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!!!");
			System.out.println("Current Url: " + url);
		}

		driver.quit();

	}

}
