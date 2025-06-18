package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class HW08_04 extends CommonMethods{

	public static void main(String[] args) {
		/*
		 * Homework 3: Add Employee Open chrome browser Go to
		 * "https://hrm.neotechacademy.com/" Login into the application Click on PIM >
		 * Add Employee Add Employee Log out Quit the browser
		 */
		try {
			setUp();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			String username =  ConfigsReader.getProperty("username");
			String password =  ConfigsReader.getProperty("password");
			
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			oneSec();
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			fiveSec();
			driver.findElement(By.xpath("//li[@id='menu_pim_viewPimModule']/a")).click();
			threeSec();
			driver.findElement(By.xpath("//span[@combinedmenutitle='PIM > Add Employee']")).click();
			threeSec();
			driver.findElement(By.id("first-name-box")).sendKeys("testt");
			driver.findElement(By.id("last-name-box")).sendKeys("testt");
			driver.findElement(By.xpath("//div[@class='filter-option-inner-inner']")).click();
			driver.findElement(By.id("bs-select-1-24")).click();
			threeSec();
			driver.findElement(By.id("modal-save-button")).click();
			
			System.out.println("Employe "+driver.findElement(By.className("toast-message")).getText() );
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_details_tab")));
			
			
			driver.findElement(By.xpath("//span[@id='account-job']/i")).click();
			fiveSec();
			driver.findElement(By.id("logoutLink")).click();
			
						
			
			fiveSec();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			tearDown();
		}
		
		
		
		
		
		
		

	}

}
