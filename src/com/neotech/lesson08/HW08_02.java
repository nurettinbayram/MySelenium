package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.CommonMethods;

public class HW08_02 extends CommonMethods{

	public static void main(String[] args) {
		/* Same as Homework1 -> Use WEbDriverWait
		 * Homework 1: Use WebDriverWait Verify element is enabled Open chrome browser
		 * Go to "https://the-internet.herokuapp.com/" Click on the "Dynamic Controls"
		 * link Click on enable button Enter "Hello" and verify text is entered
		 * successfully Close the browser
		 */
		try {
			setUp();
			driver.findElement(By.linkText("Dynamic Controls")).click();
			oneSec();
			driver.findElement(By.xpath("//button[text()='Enable']")).click();
			oneSec();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
			
			System.out.println( "HW2 - is element enabled? --> "+driver.findElement(By.id("message")).isEnabled());
			
			
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			tearDown();
		}

	}

}
