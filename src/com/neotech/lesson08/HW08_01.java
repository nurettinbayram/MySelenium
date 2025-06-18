package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class HW08_01 extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * Homework 1: Use WebDriverWait Verify element is enabled Open chrome browser
		 * Go to "https://the-internet.herokuapp.com/" Click on the "Dynamic Controls"
		 * link Click on enable button Enter "Hello" and verify text is entered
		 * successfully Close the browser
		 */
		try {
			setUp();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.linkText("Dynamic Controls")).click();
			oneSec();
			driver.findElement(By.xpath("//button[text()='Enable']")).click();
			oneSec();
			WebElement text = driver.findElement(By.id("message"));
			System.out.println("HW1 -- is P element enable? -> "+ text.isEnabled());
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			tearDown();
		}

	}

}
