package com.neotech.lesson02;

public interface I_WebDriver {

	public void get(String url);

	public void getTitle();

	public void getCurrentUrl();

	public void close();

	public void quit();
}
