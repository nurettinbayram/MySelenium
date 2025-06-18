package com.neotech.lesson09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework3 extends BaseClass {
	/*	        Add Employee
	Open chrome browser
	Go to "https://hrm.neotechacademy.com/"
	Login into the application
	Click on PIM > Add Employee 
	Add Employee
	Log out 
	Quit the browser*/
	public static void main(String[] args) throws InterruptedException {
		setUp();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// login to the application: enter username and password
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));

		// click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// locate and click on the PIM menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.linkText("Add Employee")).click();

		// there are some waiting time here
		// so i will wait until the modal is loaded and the first name box is visible
		WebDriverWait firstNameWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		firstNameWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name-box")));

		// send the new employee info
		driver.findElement(By.id("first-name-box")).sendKeys("John");
		driver.findElement(By.id("last-name-box")).sendKeys("Doe");

		// locate and fill in the location info
		WebElement locationElement = driver.findElement(By.id("location"));
		Select locationDd = new Select(locationElement);
		locationDd.selectByVisibleText("France Regional HQ");

		Thread.sleep(1000);
		driver.findElement(By.id("modal-save-button")).click();

		// verify that the personal details page is loaded
		WebDriverWait personalDetailsWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		personalDetailsWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_details_tab")));

		Thread.sleep(2000);

		// log out
		driver.findElement(By.id("user-dropdown")).click();
		driver.findElement(By.id("logoutLink")).click();

		Thread.sleep(3000);

		tearDown();
	}

}
