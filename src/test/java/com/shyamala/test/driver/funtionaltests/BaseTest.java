package com.shyamala.test.driver.funtionaltests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;

import com.shyamala.test.utils.PropertyFileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected static WebDriver driver;
	private final PropertyFileUtility propertyFileUtils = new PropertyFileUtility();

	@BeforeClass
	public void launchApplication() {
		String currentDir = System.getProperty("user.dir");
		String filePath = "C:\\Users\\serendipity\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", filePath);
		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void loginPage() {
		String url = "http://compendiumdev.co.uk/selenium/basic_html_form.html";
		// driver.get(url);
		driver.get(propertyFileUtils.getPropertyValue("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Be Happy This Page Doesn't Have Login");
	}

	@AfterMethod
	public void logoutApplication() {
		System.out.println("Be Happy This Page Doesn't Have Logout");
		//driver.close();
	}
	@AfterClass
	public void exitBrowser() {
		System.out.println("page exits");
		driver.quit();

	}
}
