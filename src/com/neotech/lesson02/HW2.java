package com.neotech.lesson02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HW2 {
	/*
	 * HW2: Facebook sign up: Open chrome browser Go to "https://www.facebook.com/"
	 * Click on Sign Up link Enter first name Enter last name Enter email address
	 * Re-enter email address Click on Sign Up button
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement createAccountBtn = driver.findElement(By.linkText("Create new account"));
		createAccountBtn.click();
		driver.findElement(By.name("firstname")).sendKeys("Nurettin");
		driver.findElement(By.name("lastname")).sendKeys("Bayram");
		driver.findElement(By.id("month")).sendKeys("2");
		driver.findElement(By.id("day")).sendKeys("20");
		driver.findElement(By.id("year")).sendKeys("1996");
		List<WebElement> radios = driver.findElements(By.name("sex"));
		for(WebElement radio : radios) {
			if(radio.getAttribute("value").equals("2")){
				radio.click();
			}
		}
		driver.findElement(By.name("reg_email__")).sendKeys("nurettin@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("9874");
		driver.findElement(By.name("websubmit")).click();
		
		
		
		Thread.sleep(15000);
		driver.quit();
		
		
	}

}
