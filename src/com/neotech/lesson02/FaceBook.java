package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://tr-tr.facebook.com/");
		
		WebElement userNameBox = driver.findElement(By.id("email"));
		userNameBox.sendKeys("neotech");
		
		WebElement passBox = driver.findElement(By.id("pass"));
		passBox.sendKeys("123456");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
