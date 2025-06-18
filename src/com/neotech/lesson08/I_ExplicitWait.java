package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.CommonMethods;

public class I_ExplicitWait extends CommonMethods{

	public static void main(String[] args) {
		
		try {
		setUp();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button1")));
//		
//		driver.findElement(By.id("button1")).click();
//		threeSec();
//		driver.switchTo().alert().accept();
		
		
		fiveSec();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnDelayedClick"))); 
		//gorunen ama etkilesime  gecilmeyecek  element yukardaki yontem ile icin bekleme suresi ekleyemezsin. 
		driver.findElement(By.id("btnDelayedClick")).click();
		tenSec();
		
		
		
		
		
		
		
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			tearDown();
		}
		
		
		
		

	}

}
