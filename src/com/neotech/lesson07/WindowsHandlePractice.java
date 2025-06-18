package com.neotech.lesson07;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class WindowsHandlePractice extends BaseClass {

	public static void main(String[] args) throws Exception {
		// https://demoqa.com/browser-windows

		setUp();
		
		System.out.println("Title --> " + driver.getTitle());
		
		
		String mainWindowHandle = driver.getWindowHandle();
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(2000);
		
		//where is the focus of the driver at this point? 
		//The main page, we never switched to any other 
		
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		System.out.println("Number of active windows: " + allWindowHandles.size());

		for (String handle : allWindowHandles)
		{
			if (!handle.equals(mainWindowHandle))
			{
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				
				
				
				driver.close();
				
			}
		}
		
		
		
		
		
		
		
		
		tearDown();
		
		
	}

}
