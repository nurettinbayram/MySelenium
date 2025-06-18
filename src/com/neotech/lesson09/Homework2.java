package com.neotech.lesson09;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {
	/*
	 * Homework 1: Use FluentDriver Verify element is enabled 
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

		// define a FluentWait object
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));
		// we can even ignore certain exceptions
		wait.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.elementToBeClickable(textBox));

		textBox.sendKeys("Iana");

		Thread.sleep(3000);

		tearDown();

	}

}
