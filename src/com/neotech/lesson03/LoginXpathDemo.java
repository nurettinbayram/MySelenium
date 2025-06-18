package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpathDemo {

	public static final String url = "https://neotech.vercel.app/login";

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// locate the elements using xpath
		// driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[1]/div/input")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Students')]")).click();

		Thread.sleep(3000);

		driver.quit();

	}

}
