package com.neotech.lesson11;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class AlertTest extends CommonMethods {
//https://neotech.vercel.app/delete-customer
	public static void main(String[] args) {
		setUp();

		// enter the customer id
		sendText(driver.findElement(By.id("customerId")), "1234");
		wait(2);

		// click on delete button
		driver.findElement(By.id("btnDeleteCustomer")).click();

		wait(2);

		dismissAlert();

		wait(2);

		driver.findElement(By.id("btnDeleteCustomer")).click();
		wait(2);
		acceptAlert();

		wait(2);
		acceptAlert();

		wait(2);

		tearDown();

	}

}
