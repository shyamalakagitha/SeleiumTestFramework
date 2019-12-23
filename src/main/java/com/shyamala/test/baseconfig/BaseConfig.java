package com.shyamala.test.baseconfig;

import org.openqa.selenium.WebDriver;

public class BaseConfig {
	
// created two constructed in baseconfig file for webdriver and url as generic so that we can call any driver or any url

	public WebDriver driver;
	public String url;
	
	public BaseConfig (WebDriver driver) {
		this.driver= driver;
	}
	public BaseConfig(WebDriver driver,String url ) {
		this.driver=driver;
	}

}
