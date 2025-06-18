package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class ImplicitWaitDemo extends BaseClass {
//https://neotech.vercel.app/waits
	public static void main(String[] args) throws Exception {

		setUp();

		// implicit wait

		// .findElement() and .findElements() immediately try to locate the element
		// if they send the request faster then the element is loaded, then we get a
		// NoSuchElementException

		// If we use implicit wait, we are telling the driver to wait x amount of
		// seconds before throwing a NoSuchElementException
		// by default, implicit wait is 0 second.

		// defining an implicit wait of 15 seconds
		// - right after the driver is initialized
		// - this wait will be for every element we try to find until the driver is quit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// will wait UP TO 15 seconds

		// Thread.sleep(10000); //will always spend 10 seconds here and will only be for
		// this line

		// find the button that shows after five seconds
		WebElement button1 = driver.findElement(By.id("button1"));
		button1.click();

		Thread.sleep(3000);

		tearDown();

	}

}
