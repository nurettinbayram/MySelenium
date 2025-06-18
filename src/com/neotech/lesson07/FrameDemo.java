package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class FrameDemo extends BaseClass{

	public static void main(String[] args) throws Exception {
		//https://jqueryui.com/tooltip/

		
		setUp();
		
		//if we try to send text to age element directly it will throw
		//a NoSuchElementException
		//Why? 
		//The focus of the driver is in the main page, and the age element
		//is inside the frame, that means it is in another page (within the main)
		
		//How do we deal with it? 
		//We need to switch to the frame: 
		//1. switch by index
		driver.switchTo().frame(0); 
		
		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("44");
		Thread.sleep(2000);
		
		//at this point you can try to click on any buttons outside the frame, but 
		//you will not be able to until you switch back to the main page
		
		driver.switchTo().defaultContent();
		
		
		//2. Switch frame by WebElement 
		
		WebElement frameEl = driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(frameEl);
		
		age.clear();
		Thread.sleep(2000);
		age.sendKeys("24");
		Thread.sleep(2000);
		
		//3. switch to frame by name or id
		//driver.switchTo().frame("name or id");
		
		
		tearDown();
		
	}

}
