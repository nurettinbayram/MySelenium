package com.neotech.lesson07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws Exception {
		/*
		 * Alert text verification Open chrome browser Go to https://demoqa.com/ Click
		 * on "Alerts, Frame & Windows" link Click on "Alerts" links on the left side
		 * Click on button to see Alert Verify alert box with text
		 * "You clicked a button" is present Click on 3rd button in the page Verify
		 * alert box with text "Do you confirm action?" is present and click "confirm"
		 * Click on 4 th button in the page and enter your name and click ok. Quit
		 * browser
		 * 
		 * 
		 */

		setUp();

		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("alertButton")).click();
		// the alert is now shown

		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text: " + alert.getText());

		Thread.sleep(2000);

		alert.accept();

		Thread.sleep(2000);

		driver.findElement(By.id("confirmButton")).click();

		Alert confirmAlert = driver.switchTo().alert();
		System.out.println("Alert Text: " + confirmAlert.getText());
		Thread.sleep(2000);

		confirmAlert.dismiss();

		driver.findElement(By.id("promtButton")).click();

		// I am reusing the Alert object above
		alert = driver.switchTo().alert();

		alert.sendKeys("Test");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);

		tearDown();

	}

}
