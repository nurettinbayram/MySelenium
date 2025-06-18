package com.neotech.lesson05;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class HW05_01 extends BaseClass {

	public static void main(String[] args) throws Exception {
		/*
		 * HW1: Orange HRM Application Login: Open Chrome browser Go to
		 * https://hrm.neotechacademy.com/ Enter valid username and password Click on
		 * login button Then verify that "span with id account-name" has the text
		 * "Jacqueline White". Quit the browser
		 */
		setUp(); // start
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Neotech@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String acountName = driver.findElement(By.id("account-name")).getText();
		if(acountName.equals("Jacqueline White")) {
			System.out.println("logged correctly");
		}
		tearDown();// finish
	}

}
