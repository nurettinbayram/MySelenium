package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class DropdownDemo extends BaseClass {
	// https://neotech.vercel.app/sis-login
	public static void main(String[] args) throws Exception {
		setUp();

		driver.findElement(By.id("tbxUsername")).sendKeys("admin");
		driver.findElement(By.id("tbxPassword")).sendKeys("admin");

		Thread.sleep(2000);

		WebElement yearDdElement = driver.findElement(By.id("ddlAcademicYear"));

		// create a Select object from the dropdown web element
		Select yearDd = new Select(yearDdElement);

		// select an option by index
		yearDd.selectByIndex(1);

		Thread.sleep(2000);

		// select an option by value
		yearDd.selectByValue("2010");

		Thread.sleep(2000);

		// select by visible text
		yearDd.selectByVisibleText("2018-19");

		Thread.sleep(2000);

		// lets get the list of options from the dropdown
		List<WebElement> options = yearDd.getOptions();

		// use advanced for loop to go over the items of the list
		for (WebElement option : options) {
			System.out.println(option.getText());
			yearDd.selectByVisibleText(option.getText());
			Thread.sleep(2000);
		}

		tearDown();

	}

}
