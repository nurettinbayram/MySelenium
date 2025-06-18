package com.neotech.lesson11;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class FacebookSignUp extends CommonMethods {
	// https://www.facebook.com/r.php
	public static void main(String[] args) {

		setUp();

		selectDropdown(driver.findElement(By.id("day")), 23);

		wait(2);

		selectDropdown(driver.findElement(By.id("month")), "Sep");

		wait(2);

		selectDropdown(driver.findElement(By.id("year")), "2001");

		wait(2);

		tearDown();

	}

}
