package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods {
	// FrameDemo at com.neotech.lesson07 using the CommonMethods.java
	// https://neotech.vercel.app/iframe
	public static void main(String[] args) {
		setUp();

		switchToFrame(0);

		WebElement age = driver.findElement(By.id("age"));
		sendText(age, "44");
		wait(2);

		driver.switchTo().defaultContent();

		WebElement frameEl = driver.findElement(By.tagName("iframe"));

		switchToFrame(frameEl);

		sendText(age, "24");
		wait(2);

		// 3. switch to frame by name or id
		// driver.switchTo().frame("name or id");

		tearDown();

	}

}
