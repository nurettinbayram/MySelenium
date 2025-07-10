package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods {

	public static void main(String[] args) {
		/*
		 	Open chrome browser
			Go to https://demo.guru99.com/test/drag_drop.html
			Drag the following blocks in different ways
			Drag BANK to DEBIT SIDE
			Drag SALES to CREDIT SIDE
			Drag 5000 to DEBIT SIDE
			Drag 5000 to CREDIT SIDE
			Close the browser 
		 
		 */
		
		setUp();
		
		//Locate the Bank to be dragged
		WebElement from1 = driver.findElement(By.id("credit2"));
		
		//Locate the debit side to place the Bank
		WebElement to1 = driver.findElement(By.id("bank"));
		
		
		//Locate the Sales to be dragged
		WebElement from2 = driver.findElement(By.id("credit1"));
		
		//Locate the creidt side to place the Sales
		WebElement to2 = driver.findElement(By.id("loan"));
		
		//Locate the 5000
		WebElement from3 = driver.findElement(By.id("fourth"));
		
		//Locate the debit side to place 5000
		WebElement to3 = driver.findElement(By.id("amt7"));
		
		//Locate the credit side to place 5000
		WebElement to4 = driver.findElement(By.id("amt8"));
		
		//To do an action, we need an Actions object
		Actions action = new Actions(driver);
		
		action.dragAndDrop(from1, to1).perform();
		
		wait(3);
		
		action.dragAndDrop(from2, to2).perform();
		
		wait(3);
		
		action.dragAndDrop(from3, to3).perform();
		
		wait(3);
		
		action.clickAndHold(from3).moveToElement(to4).release().perform();
		//same as: action.dragAndDrop(from3, to4).perform();
		
		//Verify that Perfect! is displayed
		if (driver.findElement(By.linkText("Perfect!")).isDisplayed())
		{
			System.out.println("Test Passed!");
		}
		else 
			
			System.out.println("Test Failed!");
		
		
		
		tearDown();
	}

}
