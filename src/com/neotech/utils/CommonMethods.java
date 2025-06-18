package com.neotech.utils;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass {

	/**
	 * This method clears the text of a web element and sends the text parameter to
	 * it
	 * 
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * This method pauses the execution for a certain amount of time
	 * 
	 * @param seconds
	 */
	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method selects a value from a radio button list or checkbox list
	 * 
	 * @param elementList
	 * @param selectValue
	 */
	public static void clickRadioOrCheckbox(List<WebElement> elementList, String selectValue) {
		for (WebElement el : elementList) {
			String elementValue = el.getDomAttribute("value").trim();//eklenti yapildi.

			if (elementValue.equals(selectValue) && el.isEnabled()) {
				el.click();
				break;
			}
		}
	}

	/**
	 * This method selects an item from a dropdown using the visible text
	 * 
	 * @param element
	 * @param visibleText
	 */
	public static void selectDropdown(WebElement element, String visibleText) {
		try {
			Select sl = new Select(element);
			sl.selectByVisibleText(visibleText);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method selects an item from a dropdown using the index
	 * 
	 * @param element
	 * @param visibleText
	 */
	public static void selectDropdown(WebElement element, int index) {
		try {
			Select sl = new Select(element);
			sl.selectByIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method accepts an alert if it is present in page. Otherwise the
	 * exception is handled: NoAlertPresentException
	 */
	public static void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method dismisses an alert if it is present in page. Otherwise the
	 * exception is handled: NoAlertPresentException
	 */
	public static void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method returns the text of an alert. If there is no alert in page, it
	 * returns null.
	 * 
	 * @return
	 */
	public static String getAlertText() {
		try {
			Alert alert = driver.switchTo().alert();
			return alert.getText();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * This method sends the provided text to the alert. If not alert is present in
	 * page, the exception is handled.
	 * 
	 * @param text
	 */
	public static void sendAlertText(String text) {
		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method switches to the frame whose id or name is provided. If the frame
	 * does not exist, the exception is handled.
	 * 
	 * @param nameOrId
	 */
	public static void switchToFrame(String nameOrId) {
		try {
			driver.switchTo().frame(nameOrId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method switches to the frame whose index is provided. If the frame does
	 * not exist, the exception is handled.
	 * 
	 * @param nameOrId
	 */
	public static void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method switches to the frame whose WebElement is provided. If the frame
	 * does not exist, the exception is handled.
	 * 
	 * @param nameOrId
	 */
	public static void switchToFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method switches to the child window if exists
	 */
	public static void switchToChildWindow() {
		String mainWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			if (!handle.equals(mainWindow)) {
				driver.switchTo().window(handle);
			}
		}
	}

	/**
	 * This method creates and returns a WebDriverWait object using the default wait
	 * time under Constants
	 * 
	 * @return
	 */
	public static WebDriverWait getWaitObject() {
		return new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
	}

	/**
	 * This method creates and returns a WebDriverWait object using the provided
	 * wait time
	 * 
	 * @return
	 */
	public static WebDriverWait getWaitObject(int secondsToWait) {
		return new WebDriverWait(driver, Duration.ofSeconds(secondsToWait));
	}

	/**
	 * This method waits until the element whose locater is provided is visible in
	 * page.
	 * 
	 * @param locator
	 * @return
	 */
	public static WebElement waitForVisibility(By locator) {
		return getWaitObject().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * This method waits until the provided element is clickable in page.
	 * 
	 * @param locator
	 * @return
	 */
	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method clicks on the provided web element after making sure it is
	 * clickable.
	 * 
	 * @param element
	 */
	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}
	
	//***************************** EKLENTILERIM  ************************************
	public static WebElement byId(String id) {
		return driver.findElement(By.id(id));
	}
	public static WebElement byXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	public static WebElement byCss(String css) {
		return driver.findElement(By.cssSelector(css));
	}
	
	
	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
	}

	public static void oneSec() throws InterruptedException {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void threeSec() throws InterruptedException {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void fiveSec() throws InterruptedException {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void tenSec() throws InterruptedException {
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// ***************************** EKLENTILERIM SON*****************************************

}
