package com.neotech.test;

import com.neotech.pages._LoginPagePageFatory;
import com.neotech.pages._RetryLogin;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class HW14_02 extends CommonMethods{

	public static void main(String[] args) {
		//TC 2: Orange HRM wrong password validation
		//1. Go to https://hrm.neotechacademy.com/
		//2. Enter valid username and wrong password
		//3. Click on login button
		//4. Verify error message with text "Invalid Credentials" is displayed
		
		try {
			setUp();
			_LoginPagePageFatory loginPage = new _LoginPagePageFatory();
			_RetryLogin retryLoginPage = new _RetryLogin();
			
			loginPage.username.sendKeys(ConfigsReader.getProperty("username"));
			loginPage.password.sendKeys("1234");
			loginPage.loginBtn.click();
			
			if(retryLoginPage.invalidMessage.isDisplayed()) {
				System.out.println("invalid message visibled");
			}else {
				System.out.println("no any message!!");
			}
			
			threeSec();
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			tearDown();
		}

	}

}
