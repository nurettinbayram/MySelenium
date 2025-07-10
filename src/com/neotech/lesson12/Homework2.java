package com.neotech.lesson12;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Homework2 extends CommonMethods {
	// WindowHandleDemo at com.neotech.lesson07 using the CommonMethods.java
	// https://accounts.google.com/signup

	public static void main(String[] args) {
		setUp();

		System.out.println("Title --> " + driver.getTitle());

		System.out.println("Window Handle --> " + driver.getWindowHandle());

		wait(3);

		click(driver.findElement(By.linkText("Help")));

		wait(2);

		switchToChildWindow();

		wait(2);

		String title2 = driver.getTitle();

		System.out.println("Title --> " + title2);

		// close the child window
		driver.close();

		// driver does not automatically switch back to parent window
		// System.out.println("Window title: " + driver.getTitle());

		wait(3);

		tearDown();
	}

}
