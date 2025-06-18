package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class MyTask01 extends BaseClass{
	public static void main(String[] args) throws Exception {
		/*
		 * Task 1: Facebook dropdown verification Open chrome browser
		 * Go to https://www.facebook.com/r.php
		 * Verify:
		 * month dd has 12 month options day dd has 31 day options year dd has 118 year options
		 * Select your date of birth
		 * Quit browser
		 */
		setUp();
		WebElement months = driver.findElement(By.id("month"));
		WebElement days = driver.findElement(By.id("day"));
		WebElement years = driver.findElement(By.id("year"));
		
		Select mounthDd = new Select(months);
		Select daysDd = new Select(days);
		Select yearsDd = new Select(years);
		
		mounthDd.selectByValue("2");
		daysDd.selectByValue("20");
		yearsDd.selectByValue("1996");
		
		Thread.sleep(12000);
		
		
		tearDown();
		
	}
}
