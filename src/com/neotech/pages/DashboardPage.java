package com.neotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class DashboardPage extends BaseClass {

	public WebElement logo = driver.findElement(By.id("ohrm-small-logo"));

	public WebElement accountName = driver.findElement(By.id("account-name"));
}
