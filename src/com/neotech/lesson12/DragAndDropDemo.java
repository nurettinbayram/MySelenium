package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class DragAndDropDemo extends CommonMethods {
	// https://jqueryui.com/droppable/
	public static void main(String[] args) {
		setUp();

		switchToFrame(0);

		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);

		action.dragAndDrop(draggable, droppable).perform();

		wait(3);

		// as an alternative we may also use clickAndHold method
		// action.clickAndHold(draggable).moveToElement(droppable).release().perform();

		tearDown();

	}

}
