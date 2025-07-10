package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class HW13_02 extends CommonMethods{
	

	public static void main(String[] args) {
		try {
			
			//Homework 2: Scroll Down Continuously
			//Open chrome browser
			setUp();
			//Go to "https://the-internet.herokuapp.com/"
			//Click on the "Infinite Scroll" link
			driver.findElement(By.linkText("Infinite Scroll")).click();
			//Scroll down by 500 pixels 10 times
			oneSec();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			for(int i=0;i<10;i++) {
			js.executeScript("window.scrollBy(0,500)");
			//Wait 1 second between each scroll
			oneSec();
			}
			
			//Scroll into the view of tag h3 (Infinite Scroll)
			WebElement el = driver.findElement(By.tagName("h3"));
			js.executeAsyncScript("arguments[0].scrollIntoView(true)", el);
			//Close the browser
			
			
			threeSec();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			tearDown();
		}

	}

}
