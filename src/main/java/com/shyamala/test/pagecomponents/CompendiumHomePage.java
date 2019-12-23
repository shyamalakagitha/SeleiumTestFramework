package com.shyamala.test.pagecomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.shyamala.test.pagelocators.CompendiumHomeLocator;

public class CompendiumHomePage extends CompendiumHomeLocator {

	public CompendiumHomePage(WebDriver driver) {
		super(driver);
	}

	public CompendiumHomePage(WebDriver driver, String url) {
		super(driver, url);
	}

	public void sendKeys(WebDriver driver, By locator, String textData) {

		try {
			driver.findElement(locator).sendKeys(textData);
		} catch (Exception e) {
			throw new RuntimeException(
					"GetElement and entering text in " + locator.toString() + " failed: " + e.getMessage());
		}
	}
	public void clicks(WebDriver driver, By locator) {
		try {
			driver.findElement(locator).click();
		} catch(Exception e) {
			throw new RuntimeException(
					"GetElement and click on radio button " + locator.toString() + " failed: " + e.getMessage());
		}
	}
	public void Select(WebDriver driver, By locator, String dropDownValue) {
		try {
			Select selectDropDown = new Select(driver.findElement(locator));
			selectDropDown.selectByValue(dropDownValue);
			} catch(Exception e) {
				throw new RuntimeException(
						"GetElement and select values " + locator.toString() + " failed: " + e.getMessage());
			}
			
		}
}

