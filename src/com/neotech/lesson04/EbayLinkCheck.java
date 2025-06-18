package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayLinkCheck {

	
	public static final String url = "https://www.ebay.com/";
	
	public static void main(String[] args) {
		// https://www.ebay.com/

				
	//Plan: 
		// get all ebay links
		// print the text of the links
		// print the href attribute
		// count the number of the links that have text
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		//how can I get all the links on the page???
		// We can use the tagName as all the links with have a <a />  tag
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	
		int count = 0; 
		
		
		for (WebElement link : allLinks)
		{
			if (!link.getText().isEmpty())
			{
				System.out.println(link.getText());
				System.out.println("The href is: " + link.getDomAttribute("href"));
				count++;
			}
		}
		
		System.out.println("The total number of all a tags is: " + allLinks.size());
		System.out.println("The total number of all a tags with text is: " + count);
		
		driver.quit();
		
		
	
		
	}

}
