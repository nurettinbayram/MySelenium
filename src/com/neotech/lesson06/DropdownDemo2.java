package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class DropdownDemo2 extends BaseClass {
// https://demoqa.com/select-menu
	public static void main(String[] args) throws Exception {

		setUp();

		// locate the web element
		WebElement colorDdElement = driver.findElement(By.id("oldSelectMenu"));

		// create the select object
		Select colorDd = new Select(colorDdElement);
		colorDd.selectByIndex(1);

		// locate the modern dropdown element
		WebElement modernDd = driver.findElement(By.id("withOptGroup"));
		modernDd.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(text(), 'Group 1, option 2')]")).click();

		Thread.sleep(2000);

		tearDown();
	}

}
