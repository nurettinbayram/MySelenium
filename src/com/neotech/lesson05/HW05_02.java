package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class HW05_02 extends BaseClass{

	public static void main(String[] args) throws Exception {
		/*
		 * TC 2: Orange HRM Application Negative Login: Open Chrome browser Go to
		 * https://hrm.neotechacademy.com/ Enter valid username Leave password field
		 * empty Verify error message with text "Password cannot be empty" is displayed.
		 */
		setUp();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String spanError = driver.findElement(By.id("txtPassword-error")).getText();
		if (spanError.equals("Password cannot be empty")) { // isDisplayed() kullanilabilir
			System.out.println("Getting correct ERROR message");
		}
		tearDown();		

	}

}
