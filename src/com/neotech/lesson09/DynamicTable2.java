package com.neotech.lesson09;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class DynamicTable2 extends CommonMethods{

	public static void main(String[] args) {
		try {
		setUp();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// login to the application: enter username and password
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));

		// click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// locate and click on the PIM menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.linkText("Employee List")).click();

		fiveSec();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"employeeListTable\"]/tbody/tr"));
		for(int i = 0 ; i<rows.size();i++) {
			if(rows.get(i).getText().contains("Nurettin")) {
				System.out.println(driver.findElement(By.xpath("//table[@id='employeeListTable']/tbody/tr["+(i+1)+"]/td[2]")).getText());
				driver.findElement(By.xpath("//table[@id='employeeListTable']/tbody/tr["+(i+1)+"]/td[2]")).click();
				break;
			}
		}

		System.out.println(driver.findElement(By.id("personal_details_tab")).getText());

		Thread.sleep(5000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			tearDown();
		}
		

	}

}
