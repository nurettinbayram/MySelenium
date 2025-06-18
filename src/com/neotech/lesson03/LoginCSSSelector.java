package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCSSSelector {

	public static final String url = "https://neotech.vercel.app/login";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input#password")).sendKeys("admin");

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("button#btnLogin")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Students")).click();

		driver.quit();

	}

}
