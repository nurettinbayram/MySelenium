package com.neotech.lesson11;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class HW11_02 extends CommonMethods{
	
	public static void main(String[] args) {
		try {
			setUp();
			String mainWinow = driver.getWindowHandle();
			System.out.println("Window Title --> " + driver.getTitle());
			System.out.println("Window Handle --> " + driver.getWindowHandle());
			
			click(driver.findElement(By.linkText("Help")));
			
			Set<String> allHandles = driver.getWindowHandles();
			System.out.println(allHandles);
			
			
			switchToChildWindow();
			System.out.println("Window Title --> " + driver.getTitle());
			System.out.println("Window Handle --> " + driver.getWindowHandle());
			
			driver.close();
			driver.switchTo().window(mainWinow);
			System.out.println("Window Title --> " + driver.getTitle());
			System.out.println("Window Handle --> " + driver.getWindowHandle());
			
			
			
			
			threeSec();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			tearDown();
		}

	}

}
