package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;

public class HW06_01 extends CommonMethods {

	public static void main(String[] args) throws Exception {
		/*
		 * Amazon Department List Verification Open chrome browser Go to
		 * "http://amazon.com/" Verify how many department options available. Print each
		 * department Select Computers Quit browser
		 */
		try {
			setUp();
			//Thread.sleep(15000);

			WebElement deparment = driver.findElement(By.id("searchDropdownBox"));
			Select departmanDd = new Select(deparment);

			List<WebElement> options = departmanDd.getOptions();
			System.out.println("size of department : "  + options.size());

			for (WebElement option : options) {
				System.out.println(option.getText());
			}
			
			departmanDd.selectByValue("search-alias=computers");
			Thread.sleep(4000);
			driver.findElement(By.id("nav-search-submit-button")).click();
			fiveSec();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			tearDown();
		}

		

		

	}

}
