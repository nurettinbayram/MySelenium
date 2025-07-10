package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class _RetryLogin {
	
	@FindBy(className = "toast-message")
	public WebElement invalidMessage ;
	
	public _RetryLogin() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	


}
