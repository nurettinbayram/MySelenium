package com.neotech.lesson02;

public class C_ChromeDriver implements I_WebDriver {

	public C_ChromeDriver() {
		System.out.println("Chrome is opening!");
	}

	@Override
	public void get(String url) {
		System.out.println("Chrome navigates to " + url);
	}

	@Override
	public void getTitle() {
		System.out.println("Page Title");
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("Current Url");
	}

	@Override
	public void close() {
		System.out.println("Window is closing!");
	}

	@Override
	public void quit() {
		System.out.println("Chrome is quiting");
	}

}
