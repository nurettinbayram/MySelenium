package com.neotech.lesson08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {
	/*	 
	1) Launch the browser and open the site "https://neotech.vercel.app/email"
	2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
	3) On the Child Window, Enter your email ID and submit.
	4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
	5) Close the Child window on which credentials are displayed.Switch to the parent window.
	6) Quit all browsers
	
	*/

	public static void main(String[] args) throws Exception {
		setUp();

		Thread.sleep(3000);

		// locate and click on the Click here link
		driver.findElement(By.linkText("Click Here")).click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();

		// we have to switch into the child window
		driver.switchTo().window(childWindow);

		// enter the email in child window
		driver.findElement(By.id("emailid")).sendKeys("test@gmail.com");
		// driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("test@gmail.com");

		Thread.sleep(3000);

		// click on the button
		driver.findElement(By.name("btnLogin")).click();

		Thread.sleep(3000);

		// get the credentials from the page
		String username = driver.findElement(By.id("username")).getText();
		String password = driver.findElement(By.id("password")).getText();

		System.out.println("Username is: " + username);
		System.out.println("Password is: " + password);

		// close the child window, switch back to the main window
		driver.close();

		Thread.sleep(3000);
		// driver.switchTo().window(parentWindow);

		tearDown();

	}

}
