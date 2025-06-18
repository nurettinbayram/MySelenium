package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static String url = "https://neotech.vercel.app/sign-up";

	public static void main(String[] args) throws InterruptedException {
		// https://neotech.vercel.app/sign-up
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement maleRB = driver.findElement(By.xpath("//label[@for='male']"));
		maleRB.click();
		
		Thread.sleep(3000);
		
		//one liner, method chaining
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(3000);		
		
		driver.findElement(By.cssSelector("label[for='wednesday']")).click();
		Thread.sleep(3000);		
		
		
		//If I do not know which elements to check prior, then I will get all 
		//those elements, and then use loop + if to select them
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='inline_grid choices']/label"));
		
		//Let us assume I want to click on: Female, Saturday, and Sunday
		
		for (WebElement el : elements)
		{
			String text = el.getText();
			
			if (text.equals("Female"))
			{
				el.click();
			}
			else if (text.equals("Saturday"))
			{
				el.click();
			}
			else if (text.equals("Sunday"))
			{
				el.click();
			}
			
			Thread.sleep(1000);
		}
		
		
		
		driver.quit();
		
		

	}

}
