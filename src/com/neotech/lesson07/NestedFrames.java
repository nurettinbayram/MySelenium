package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class NestedFrames extends BaseClass {
	public static void main(String[] args) throws Exception {
		// https://neotech.vercel.app/iframe/nested
		
		
		setUp();
		
		//switch to parent frame
		driver.switchTo().frame("parent-frame");
		
		
		//switch to child frame 
		driver.switchTo().frame(driver.findElement(By.id("child-frame")));
		
		//since we have the frame(String nameOrId), then if I have an id, of course I would use that.
		
		
		//now the driver focus is in the child frame
		WebElement p = driver.findElement(By.tagName("p"));
		String text = p.getText();
		
		System.out.println("The text inside the child frame is: " + text);
		
		
		tearDown();
		
		
	}
}
