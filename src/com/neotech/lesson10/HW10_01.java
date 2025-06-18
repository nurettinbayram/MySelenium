package com.neotech.lesson10;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.neotech.utils.CommonMethods;

public class HW10_01 extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * Homework: American Airlines Flight Search
		 * Open chrome browser Go to https://www.aa.com/homePage.do Enter From and To
		 * Select departure as December 14 of 2024 Select arrival as December 22 of 2024
		 * Click on search Close browser
		 */
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.aa.com/homePage.do");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			// site hatasi  

			threeSec();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
