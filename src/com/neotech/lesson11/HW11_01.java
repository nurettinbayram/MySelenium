package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class HW11_01 extends CommonMethods{

	public static void main(String[] args) {
		try {
			setUp();
			switchToFrame(0);
			WebElement el =driver.findElement(By.id("age"));
			
			sendText(el, "25");
			oneSec();
			sendText(el, "29");
			threeSec();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			tearDown();
		}
	}

}
