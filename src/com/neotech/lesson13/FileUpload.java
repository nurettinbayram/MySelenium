package com.neotech.lesson13;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class FileUpload extends CommonMethods {

	public static void main(String[] args) {
		// https://the-internet.herokuapp.com/

		setUp();
		
		click(driver.findElement(By.linkText("File Upload")));
		
		//Keep in mind! Selenium CANNOT control the explorer/finder window popups. 
		//To upload a file we will send the file path to the input element
		
		String filePath = System.getProperty("user.dir") + "\\screenshots\\Lesson13\\Homework2.png";
		
		wait(2);
		
		sendText(driver.findElement(By.id("file-upload")), filePath);
		
		wait(2);
		
		click(driver.findElement(By.id("file-submit")));
		
		wait(2);
		
		tearDown();
	}

}
