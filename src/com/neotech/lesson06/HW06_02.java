package com.neotech.lesson06;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class HW06_02 extends CommonMethods{

	public static void main(String[] args) throws Exception {
		/*
		 * Alert text verification Open chrome browser Go to https://demoqa.com/ Click
		 * on "Alerts, Frame & Windows" link Click on "Alerts" links on the left side
		 * Click on button to see Alert Verify alert box with text
		 * "You clicked a button" is present Click on 3rd button in the page Verify
		 * alert box with text "Do you confirm action?" is present and click "confirm"
		 * Click on 4 th button in the page and enter your name and click ok. Quit
		 * browser
		 */
		
		setUp();
		scroll(driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")));
		oneSec();
		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		oneSec();
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		oneSec();
		driver.findElement(By.id("alertButton")).click();
		oneSec();
		driver.switchTo().alert().accept();
		oneSec();
		//driver.findElement(By.id("timerAlertButton")).click();
		//fiveMin();
		//driver.switchTo().alert().accept();
		//oneMin();
		scroll(driver.findElement(By.id("confirmButton")));
		oneSec();
		driver.findElement(By.id("confirmButton")).click();
		oneSec();
		driver.switchTo().alert().accept();
		oneSec();
		driver.findElement(By.id("promtButton")).click();
		oneSec();
		driver.switchTo().alert().sendKeys("Nurettin");
		threeSec();
		driver.switchTo().alert().accept();
		
		
		
		
		tearDown();
		
		

	}

}
