package com.neotech.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 
		 	=================   Lesson 09 HW 2 =================================
			TC: Delete Orders
			
			1) Open chrome browser
			2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
			3) Login to the application
			4) Click on the checkbox of all orders with product FamilyAlbum
			5) Delete Selected orders
			6) Verify the orders have been deleted
			7) Quit the browser
		 
		 */
		
		setUp();
		
		
		//login 
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		
		
		//Click on the checkbox of all orders with product FamilyAlbum
		List<WebElement> productColumn = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[3]"));
		
		//check each element if it is equal to FamilyAlbum
		//if yes, check the checkbox for the same row
		
		Thread.sleep(2000);
		
		for (int i = 0; i < productColumn.size(); i++)
		{
			String text = productColumn.get(i).getText();
			
			if (text.equals("FamilyAlbum"))
			{
				//where is the checkbox located
				//table[@id='ctl00_MainContent_orderGrid']//tr[??????]//td[1]
				
				
				//all the paths ending with td[1] are checkboxes 
				
				String path = "//table[@id='ctl00_MainContent_orderGrid']//tr["+(i+2)+"]//td[1]";
				System.out.println("Path: " + path);
				
				driver.findElement(By.xpath(path)).click();
				
				
				Thread.sleep(4000);
				
			}
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
		
		Thread.sleep(2000);
		
		
		tearDown();
		
		
	}

}
