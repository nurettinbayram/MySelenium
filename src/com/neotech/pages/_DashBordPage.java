package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class _DashBordPage {

	@FindBy(id="account-name")
	public WebElement accountName;
	
	public _DashBordPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
