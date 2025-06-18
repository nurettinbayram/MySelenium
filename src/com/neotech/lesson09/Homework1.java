package com.neotech.lesson09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {
	/*
	 * Homework 1: Use WebDriverWait Verify element is enabled 
	 * Open chrome browser
	 * Go to "https://neotech.vercel.app/" 
	 * Click on the "Interactions" link 
	 * Then click on "Waits"
	 * Click on enable button 
	 * Enter "Hello" and verify text is entered successfully 
	 * Close the browser
	 */

	public static void main(String[] args) throws InterruptedException {

		setUp();

		// implicit wait
		// declared once when the driver object is created
		// will apply to all findElement and findElements calls
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// click on interactions
		driver.findElement(By.id("menu-interactions")).click();
		driver.findElement(By.xpath("//a[@id='waits']")).click();
		// click on the Enable button
		driver.findElement(By.xpath("//form[@id='input-example']/button")).click();

		// there is some waiting here
		// the textbox is there but is it not enabled
		WebElement textBox = driver.findElement(By.xpath("//form[@id='input-example']/input"));

		// define a WebDriverWait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(textBox));

		textBox.sendKeys("Emrah");

		Thread.sleep(3000);

		tearDown();

	}

}
