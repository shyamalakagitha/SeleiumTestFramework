package com.shyamala.test.pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.shyamala.test.baseconfig.BaseConfig;

public class CompendiumHomeLocator extends BaseConfig {

	public CompendiumHomeLocator(WebDriver driver) {
		super(driver);
	}

	public CompendiumHomeLocator(WebDriver driver, String url) {
		super(driver, url);
	}

	public final By USER_NAME = By.name("username");
	public final By PASSWORD = By.name("password");
	public final By TEXT_AREA = By.name("comments");
	public final By FILE_NAME = By.name("filename");
	public final By CHECK_BOX = By.xpath("//td[contains(text(),'Checkbox Items:')]//input[2]");
	public final By RADIO_BUTTON = By.xpath("//td[contains(text(),'Radio Items:')]//input[1]");
	public final By DROP_DOWN = By.name("dropdown");
	public final By SUBMIT = By.xpath("//input[@value='submit']");
	
	
    
}
