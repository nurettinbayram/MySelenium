package com.neotech.lesson13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class HW13_01 extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * Homework 1: File Upload Upload a file:
		 * http://webdriveruniversity.com/File-Upload/index.html
		 */
		try {
			setUp();
			String filePath = System.getProperty("user.dir")+"\\screenshots\\Lesson13\\Homework2.png";
			
			driver.findElement(By.id("myFile")).sendKeys(filePath);
			
			driver.findElement(By.id("submit-button")).click();
			
			Alert alert = driver.switchTo().alert();
			String alertTxt = alert.getText();
			if(alertTxt.contains("Your file has now been uploaded!"))
				System.out.println("Test Pass!!");
			alert.accept();

			threeSec();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tearDown();
		}

	}

}
