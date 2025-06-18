package com.neotech.lesson10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.neotech.utils.CommonMethods;

public class TurkishAirlines extends CommonMethods{

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		try {
			driver.get("https://www.turkishairlines.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.findElement(By.id("fromPort")).sendKeys("New Yark");
			driver.findElement(By.id("toPort")).sendKeys("Istanbul");
			
			driver.findElement(By.xpath("//div[text()='Dates']")).click();
			
			WebElement mounth = driver.findElement(By.cssSelector("button[class*='monthDropdown']"));
			
			while (!mounth.getText().contains("September 2025")) {
				driver.findElement(By.cssSelector("button[aria-label*='next month']")).click();
				oneSec();
				mounth = driver.findElement(By.cssSelector("button[class*='monthDropdown']"));
			}
			
			// siteye ulasilamiyor.
			
			
			threeSec();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}

	}

}
