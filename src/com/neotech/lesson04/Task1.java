package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static final String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	
	public static void main(String[] args) throws InterruptedException {
		// http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx

		/*
		1. Open chrome browser
		2. Go to	"http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
		3. Enter valid username and password
		4. Click on login button
		5. Then verify "Web Orders" is displayed and also username 
			is displayed in the right top corner
		 
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		
		driver.findElement(By.cssSelector("#ctl00_MainContent_username"))
		.sendKeys("Tester");
		
		driver.findElement(By.name("ctl00$MainContent$password"))
		.sendKeys("test");
		
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		//at this point we must be logged in!!!
		Thread.sleep(2000);
		
		WebElement header = driver.findElement(By.tagName("h1"));
		
		
		if (header.isDisplayed())
		{
			System.out.println("The header " + header.getText() 
			+ " is displayed!");
		}
		else
		{
			System.out.println("The header is NOT displayed!");
		}
		
		
		//locate the login info: 
		//css selector: div.login_info (or just .login_info since its unique)
		//xpath: //div[@class = 'login_info']
		//by className: login_info
		
		
		WebElement loginInfo = driver.findElement(By.className("login_info"));
		System.out.println(loginInfo.getText());
		
		if (loginInfo.getText().contains("Tester"))
		{
			System.out.println("Tester logged in successfully!");
		}
		else
		{
			System.out.println("Login failed!!!");
		}
		driver.quit();
		
		
	}

}
