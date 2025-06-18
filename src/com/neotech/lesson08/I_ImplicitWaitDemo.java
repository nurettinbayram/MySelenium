package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class I_ImplicitWaitDemo extends BaseClass{

	public static void main(String[] args) {
		try {
			setUp();
			// elementler yuklenmedigi taktirde 5 sn bekle bu sadece element bulma isleminde kullanilir
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
			driver.findElement(By.id("button1")).click();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			tearDown();
		}

	}

}
