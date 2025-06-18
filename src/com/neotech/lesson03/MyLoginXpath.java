package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLoginXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://neotech.vercel.app/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\'username\']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Student')]")).click();
		Thread.sleep(5000);
		
		
		
		driver.quit();

	}

}
