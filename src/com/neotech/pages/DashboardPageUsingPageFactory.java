package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class DashboardPageUsingPageFactory {

	@FindBy(id = "ohrm-small-logo")
	public WebElement logo;

	@FindBy(id = "account-name")
	public WebElement accountName;

	public DashboardPageUsingPageFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
