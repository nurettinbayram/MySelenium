package com.neotech.lesson07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass{

	public static void main(String[] args) throws Exception {

		/*
			Amazon Department List Verification
	        Open chrome browser
	        Go to "http://amazon.com/"
	        Verify how many department options available.
	        Print each department 
	        Select Computers
	        Quit browser
			 
		 */

		setUp();
		
		WebElement department = driver.findElement(By.id("searchDropdownBox"));
		Select departmentDd = new Select(department);
		
		List<WebElement> options = departmentDd.getOptions();
		
		System.out.println("There are " + options.size() + " departments!");
		
		for (WebElement el : options)
		{
			System.out.println(el.getText());
		}
		
		//select Computers		
		//tbd
		departmentDd.selectByValue("search-alias=computers");
		
		Thread.sleep(4000);
		
		tearDown();
	}

}
