package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;

public class HW06_03 extends CommonMethods {

	public static void main(String[] args) throws Exception {
		/*
		 * Open chrome browser Go to "https://semantic-ui.com/modules/dropdown.html"
		 * Scroll down to "Multiple Selection" Click on drop down and select "CSS" and
		 * "HTML" Verify value has been selected Deselect 1 of the options from the
		 * dropdown Quit browser
		 */
		try{
			
		setUp();
		threeSec();
		driver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[8]/div")).click();
		WebElement element =  driver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/select"));
		threeSec();
		Select elementDd = new Select(element);
		elementDd.selectByVisibleText("CSS");
		fiveSec();
		
		// tamamla?????
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
		
		tearDown();
		}
		

	}

}
