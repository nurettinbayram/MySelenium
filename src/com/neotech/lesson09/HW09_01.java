package com.neotech.lesson09;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class HW09_01 extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * 1) Open chrome browser 2) Go to
		 * "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
		 * 3) Login to the application 4) Verify customer "Susan McLaren" is present in
		 * the table 5) Click on customer details 6) Update customers last name and
		 * credit card info 7) Verify updated customers name and credit card number is
		 * displayed in table 8) Close browser
		 */
		try {
			setUp();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(ConfigsReader.getProperty("username"));
			driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(ConfigsReader.getProperty("password"));
			driver.findElement(By.id("ctl00_MainContent_login_button")).click();

			oneSec();
			List<WebElement> rows = driver.findElements(By.cssSelector("table.SampleTable  tr"));
			System.out.println("There are " + rows.size() + " rows");

			driver.manage().window().setSize(new Dimension(1550, 414));
			driver.manage().window().setPosition(new Point(0, 0));
			threeSec();

			for (int row = 1; row < rows.size(); row++) {
				List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
				// String rowText = rows.get(row).getText();
				// WebElement editTD =
				// driver.findElement(By.xpath(String.format("//table[@class='SampleTable']//tr[%d]/td[1]",
				// row + 2)));
				scroll(cols.get(0));
				cols.get(0).click();
				System.out.println(cols.get(1).getText() + " was selected for deletion.");
				oneSec();

			}
			System.out.println("---------------------------------------------------------");
			driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
			System.out.println(driver.findElement(By.id("ctl00_MainContent_orderMessage")).getText());

			tenSec();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tearDown();
		}

	}

}
