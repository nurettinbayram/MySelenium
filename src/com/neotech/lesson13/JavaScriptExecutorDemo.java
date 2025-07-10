package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class JavaScriptExecutorDemo extends CommonMethods {

	public static void main(String[] args) {
		// https://hrm.neotechacademy.com

		
		
		setUp();
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		js.executeScript("arguments[0].style.backgroundColor='blue';", username);
		js.executeScript("arguments[0].style.backgroundColor='red';", password);
		
		//we can run multiple commands on the same script
		js.executeScript("arguments[0].style.backgroundColor='red';"
				+ "arguments[1].style.backgroundColor='blue';", username, password);
		
		
		wait(5);
		
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button")));
		
		
		//go to PIM
		click(driver.findElement(By.id("menu_pim_viewPimModule")));
		
		//go to Employee List
		click(driver.findElement(By.linkText("Employee List")));
		
		wait(5);
		
		//Scrolling using JS Executor
		//We can scroll by defining the pixel amount to move 
		
		
		//Scroll vertically downwards
		js.executeScript("window.scrollBy(0, 1500)");
		
		wait(4);

		//now lets scroll up
		js.executeScript("window.scrollBy(0, -500)");
		
		wait(4);
		//I want to scroll up/down until I see the user dropdown (id: user-dropdown)
		
		WebElement user = driver.findElement(By.id("user-dropdown"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", user);
	
		wait(4);
		
		tearDown();
	}

}
