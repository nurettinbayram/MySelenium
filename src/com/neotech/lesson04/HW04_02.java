package com.neotech.lesson04;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW04_02 {
	public static String url = "https://demoqa.com/radio-button";

	public static void main(String[] args) throws InterruptedException {
		/*
		 * ===========HW-2========== Radio Button Practice Open chrome browser Go to
		 * "https://demoqa.com/radio-button" Verify if all radio buttons are displayed
		 * and clickable Click on all radio buttons Verify radio buttons has been
		 * clicked successfully Quit browser
		 */

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(200);

		List<WebElement> radios = driver.findElements(By.cssSelector("input[type='radio']"));

		for (WebElement radio : radios) {
			String id = radio.getDomAttribute("id");
			WebElement label = driver.findElement(By.cssSelector("label[for='" + id + "']"));

			boolean isDisabled = radio.getDomAttribute("disabled") != null;

			System.out.println(isDisabled); // kendi aldigimiz ile selenium metodu olan isDisabled benzer calismiyorlar.
			System.out.println(radio.isDisplayed()); //Bir elementin ekranda görünür olup olmadığını kontrol eder.
			System.out.println(radio.isEnabled()); //Bir elementin etkin (aktif) olup olmadığını kontrol eder.
			System.out.println(radio.isSelected()); //Bir radio button veya checkbox'ın şu anda seçili (checked) olup olmadığını kontrol eder.

			if (!isDisabled) {
				label.click();
				System.out.println("\"" + label.getText() + "\" is clickable");
			} else {
				System.out.println("\"" + label.getText() + "\" is NOT clickable");
			}
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("arguments[0].checked = false;", radio);// secilmis olan radio buttonu secimden cikarma

		}

		Thread.sleep(6000);
		driver.quit();

	}

}
