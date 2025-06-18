package com.neotech.lesson04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW04_01 {
	public static final String url= "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	
	public static void main(String[] args) throws InterruptedException {
		/*
		 * ===========HW-1========== Open chrome browser Go to
		 * "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
		 * Enter valid username Clear username and enter again valid username Leave
		 * password field empty Click on login button Verify error message with text
		 * "Invalid Login or Password." is displayed.
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement username =driver.findElement(By.cssSelector("#ctl00_MainContent_username"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		username.sendKeys("Tester");
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("Tester");
		Thread.sleep(1000);
		driver.findElement(By.className("button")).click();
		
		String error = driver.findElement(By.className("error")).getText();
		if(error.contains("Invalid Login or Password.")) {
			System.out.println("got error msg");
		}else {
			System.out.println("didnt get error mes");
		}
		
		
		Thread.sleep(10000);
		driver.quit();
		
		
		

	}

	private static WebElement findElement(By id) {
		// TODO Auto-generated method stub
		return null;
	}

}
