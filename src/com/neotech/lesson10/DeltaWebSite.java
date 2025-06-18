package com.neotech.lesson10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.neotech.utils.CommonMethods;

public class DeltaWebSite extends CommonMethods{

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		try {
			driver.get("https://www.delta.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.findElement(By.id("input_departureDate_1")).click();
			WebElement mount1 = driver.findElement(By.className("dl-datepicker-month-0"));
			while(!mount1.getText().contains("August")) {
				driver.findElement(By.xpath("//span[@class='monthSelector' and text()='Next']")).click();
				mount1 = driver.findElement(By.className("dl-datepicker-month-0"));
				oneSec();				
			}
			
			driver.findElement(By.xpath("//tbody[@class='dl-datepicker-tbody-0']//a[text()='14']")).click();
			oneSec();
			
			WebElement mounth2 = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']"));
			WebElement year = driver.findElement(By.xpath("//span[@class='dl-datepicker-year dl-datepicker-year-1']"));
			
			while(!mounth2.getText().contains("January") && !year.getText().contains("2026")) {
				driver.findElement(By.xpath("//span[@class='monthSelector' and text()='Next']")).click();
				mounth2 = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']"));
				year = driver.findElement(By.xpath("//span[@class='dl-datepicker-year dl-datepicker-year-1']"));
				oneSec();
			}
			
			driver.findElement(By.xpath("//tbody[@class='dl-datepicker-tbody-1']//a[text()='1']")).click();
			oneSec();
			driver.findElement(By.xpath("//button[text()='done']")).click();
			
			threeSec();
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
