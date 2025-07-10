package com.neotech.test;

import com.neotech.pages.DashboardPage;
import com.neotech.pages.LoginPage;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingPOM extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		// after setUp(), we are in login page and the elements are ready
		LoginPage loginPage = new LoginPage();

		// enter the username
		sendText(loginPage.username, ConfigsReader.getProperty("username"));

		// enter the password
		sendText(loginPage.password, ConfigsReader.getProperty("password"));

		// click on the login button
		click(loginPage.loginBtn);

		// or:
		// loginPage.loginBtn.click();

		wait(5);

		// at this point we can locate all dashboard web elements
		DashboardPage dashboard = new DashboardPage();

		// verify if the logo is displayed or not
		if (dashboard.logo.isDisplayed()) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed!!!");
		}

		// verify the logged in user is "Jacqueline White"
		String exceptedName = "Jacqueline White";
		String actualName = dashboard.accountName.getText();

		if (actualName.equals(exceptedName)) {
			System.out.println(exceptedName + " logged in.");
		} else {
			System.out.println(exceptedName + " did NOT log in!");
		}

		wait(3);
		tearDown();

	}

}
