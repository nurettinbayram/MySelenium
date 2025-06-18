package com.neotech.lesson08;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {
	/*
	 
	1) Launch the browser and open the site "https://neotech.vercel.app/iframe/multi2"
	2) Verify on the page header "Not a Friendly Topic" displayed
	3) Click on the Inner Frame Check box
	4) Choose Dog from Animals dropdown
	5) Quit the browser
	 
	 */
	public static void main(String[] args) throws Exception {
		setUp();

		String label = driver.findElement(By.xpath("//label/span")).getText();
		System.out.println(label + " --> " + label.equals("Not a Friendly Topic"));

		// lets use the isDisplayed() method to find if the header contains the text
		boolean result = driver.findElement(By.xpath("//label/span")).isDisplayed();
		System.out.println("Header contains the text: " + result);
		
		//switch into the first iframe
		driver.switchTo().frame("nested1");

		// switch into the child iframe
		driver.switchTo().frame("child-frame");
		// driver.switchTo().frame(0);

		Thread.sleep(3000);

		// click on the checkbox
		driver.findElement(By.id("inner-frame-check-box")).click();

		Thread.sleep(3000);

		// lets get back to the main content before switching into the Animal iframe
		driver.switchTo().defaultContent();

		// switch into the animals iframe
		driver.switchTo().frame("animals");

		// create the Select object and select Dog from it
		Select animalsDd = new Select(driver.findElement(By.id("animal-select")));
		animalsDd.selectByVisibleText("Dog");

		Thread.sleep(3000);

		tearDown();

	}

}
