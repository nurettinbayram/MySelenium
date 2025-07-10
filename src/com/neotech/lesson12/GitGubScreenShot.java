package com.neotech.lesson12;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class GitGubScreenShot extends CommonMethods{

	public static void main(String[] args) {
		try {
			setUp();
			TakesScreenshot scrShot = (TakesScreenshot)driver;
			File ScrFile = scrShot.getScreenshotAs(OutputType.FILE);
			
			File scrDir = new File("screenshots/HRM");
			
			if (!scrDir.exists()) {
				scrDir.mkdir();
			}
			File screenShoteLocation = new File("screenshots/HRM/git.png");
			Files.copy(ScrFile, screenShoteLocation);
			
			
			
			
			wait(3);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			tearDown();
		}

	}

}
