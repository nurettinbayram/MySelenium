package com.neotech.test;

import java.time.Duration;

import org.openqa.selenium.WebElement;

import com.neotech.pages._LoginPagePageFatory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class _LoginTest extends CommonMethods{

	public static void main(String[] args) {
		//TC 1: Orange HRM blank password validation
		//1. Go to https://hrm.neotechacademy.com/
		//2. Enter valid username and leave password field empty
		//3. Click on login button
		//4. Verify error message with text "Password cannot be empty" is displayed
		
		
		setUp();
		
		// bu ifadenin setUp() tan sonra geldigine dikkat et!!!!!!!!!!!!!!!!!!!!!!!
		_LoginPagePageFatory loginPage = new _LoginPagePageFatory();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		try {
			
			loginPage.username.sendKeys(ConfigsReader.getProperty("username"));
			oneSec();
			
			loginPage.loginBtn.click();
			oneSec();
			
			WebElement textError = loginPage.passwordError;			
			if (textError.isDisplayed()) {
				System.out.println("Error Message is '"+textError.getText()+"'");
				System.out.println("The password error message became visible.");
			}else {
				System.out.println("Message does not visible!!");
			}
			
			
			
			
			
			
			
			
			threeSec();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			tearDown();
		}

	}

}
