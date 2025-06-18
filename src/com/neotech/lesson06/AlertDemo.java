package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class AlertDemo extends BaseClass {

	public static void main(String[] args) throws Exception {

		setUp();

		driver.findElement(By.id("customerId")).sendKeys("1234");
		WebElement btn = driver.findElement(By.id("btnDeleteCustomer"));
		btn.click();

		// alert pops up after clicking the button
		// so lets switch into the alert box

		Alert simpleAlert = driver.switchTo().alert();

		// lets dismiss the alert
		String alertText = simpleAlert.getText();
		System.out.println(alertText);
		Thread.sleep(2000);
		simpleAlert.dismiss(); // clicking the Cancel on Alert

		Thread.sleep(2000);

		// lets show the alert again
		btn.click();
		Alert secondAlert = driver.switchTo().alert();

		Thread.sleep(2000);
		secondAlert.accept();// clicking the OK button

		// another alert pops up so i have to handle it also
		Alert lastAlert = driver.switchTo().alert();
		System.out.println(lastAlert.getText());
		Thread.sleep(2000);

		// driver.switchTo().alert().accept();
		lastAlert.accept();

		Thread.sleep(2000);

		tearDown();
	}

}
