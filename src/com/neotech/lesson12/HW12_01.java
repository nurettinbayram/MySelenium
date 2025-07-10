package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class HW12_01 extends CommonMethods{

	public static void main(String[] args) {
		/*
		 * Homework 1: Open chrome browser Go to
		 * https://demo.guru99.com/test/drag_drop.html Drag the following blocks in
		 * different ways 
		 * Drag BANK to DEBIT SIDE 
		 * Drag SALES to CREDIT SIDE 
		 * Drag 5000 to  DEBIT SIDE 
		 * Drag 5000 to CREDIT SIDE 
		 * Close the browser
		 */
		setUp();
		WebElement bankEle = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement salesEle = driver.findElement(By.xpath("//li[@id='credit1' ]//a"));
		WebElement amountEle = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement debitAconuntSide = driver.findElement(By.id("bank"));
		WebElement creditAconuntSide = driver.findElement(By.id("loan"));
		WebElement debitAmountSide = driver.findElement(By.id("amt7"));
		WebElement creditAmountSide = driver.findElement(By.id("amt8"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(bankEle, debitAconuntSide).perform();
		oneSec();
		action.dragAndDrop(salesEle, creditAconuntSide).perform();
		oneSec();
		action.dragAndDrop(amountEle, debitAmountSide).perform();
		oneSec();
		action.dragAndDrop(amountEle, creditAmountSide).perform();
		oneSec();
		
		
		tearDown();
		
		
		
		

	}

}
