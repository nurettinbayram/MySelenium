package com.neotech.lesson05;

import com.neotech.utils.BaseClass;

public class OpenOrangeHrm3 extends BaseClass {

	public static void main(String[] args) throws Exception {
		// setup the testing environment
		setUp();

		// write your test
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);

		// close the browser
		tearDown();
	}

}
