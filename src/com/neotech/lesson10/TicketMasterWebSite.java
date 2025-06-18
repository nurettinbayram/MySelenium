
package com.neotech.lesson10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.neotech.utils.CommonMethods;

public class TicketMasterWebSite extends CommonMethods {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		try {
			driver.get("https://www.ticketmaster.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			driver.findElement(By.xpath("//span[contains(text(),'All Dates')][1]")).click();

			WebElement mounth = driver
					.findElement(By.xpath("//*[@id='datePicker']/div[3]/div/form/div[2]/div[1]/span/span[2]"));

			while (!mounth.getText().contains("Nov 2025")) {

				driver.findElement(By.cssSelector("button[class*='hsATWj']")).click();
				oneSec();
				mounth = driver
						.findElement(By.xpath("//*[@id='datePicker']/div[3]/div/form/div[2]/div[1]/span/span[2]"));
			}
			driver.findElement(By.xpath("//div[@class='sc-47136489-11 cHpetH'][1]//span[text()='10']")).click();

			threeSec();

			while (!mounth.getText().contains("Jan 2026")) {

				driver.findElement(By.cssSelector("button[class*='hsATWj']")).click();
				oneSec();
				mounth = driver
						.findElement(By.xpath("//*[@id='datePicker']/div[3]/div/form/div[2]/div[1]/span/span[2]"));
			}
			driver.findElement(By.xpath("//div[@class='sc-47136489-11 cHpetH'][1]//span[text()='1']")).click();
			
			oneSec();
			
			driver.findElement(By.xpath("//button[@class='indexstyles__StyledButton-sc-83qv1q-0 dSTFtM']")).click();
			
			oneSec();
			driver.findElement(By.name("q")).sendKeys("MetLife");
			
			driver.findElement(By.xpath("//button[@type='submit'][1]//span[text()='Search']")).click();
			
			tenSec();
			
			
			fiveSec();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
