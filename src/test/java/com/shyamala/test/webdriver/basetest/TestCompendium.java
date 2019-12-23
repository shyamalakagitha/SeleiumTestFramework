package com.shyamala.test.webdriver.basetest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.shyamala.test.dataproviders.DataProviders;
import com.shyamala.test.driver.funtionaltests.BaseTest;
import com.shyamala.test.pagecomponents.CompendiumHomePage;


public class TestCompendium extends BaseTest {
	
	private final CompendiumHomePage comp = new CompendiumHomePage(driver);
        	
	@Test(dataProvider = "InputData", dataProviderClass = DataProviders.class)
	public void CompendiumHome(String UserName, String Password, String TextArea, String FileName, String DropDown) {
		comp.sendKeys(driver, comp.USER_NAME, UserName);
		comp.sendKeys(driver, comp.PASSWORD, Password);
		comp.sendKeys(driver, comp.TEXT_AREA, TextArea);
		comp.sendKeys(driver, comp.FILE_NAME, FileName);
		comp.clicks(driver, comp.CHECK_BOX);
		comp.clicks(driver, comp.RADIO_BUTTON);
		comp.Select(driver, comp.DROP_DOWN, DropDown);
		comp.clicks(driver, comp.SUBMIT);
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals("The input data entered in the form is not same in the current page" + true, true);
		softassert.assertAll();	
		
	}
}

