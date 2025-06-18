package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class MultiSelectDropDown extends BaseClass {

	public static void main(String[] args) throws Exception {
		setUp();
		WebElement multiSelect = driver.findElement(By.id("multi-select"));
		Select states = new Select(multiSelect);

		if (states.isMultiple()) {
			List<WebElement> options = states.getOptions();
			for(WebElement option : options) {
				System.out.println(option.getText());
				option.click(); ///eksik tamamla
			}

		}

		tearDown();

	}

}
