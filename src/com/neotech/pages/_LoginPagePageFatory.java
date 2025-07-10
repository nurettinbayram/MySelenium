package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class _LoginPagePageFatory {

	@FindBy(id="txtUsername")
	public WebElement username; 
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(xpath = "//button")
	public WebElement loginBtn;
	
	@FindBy(id="txtUsername-error")
	public WebElement usernameError;
	
	@FindBy(id="txtPassword-error")
	public WebElement passwordError;
	
	public _LoginPagePageFatory() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
