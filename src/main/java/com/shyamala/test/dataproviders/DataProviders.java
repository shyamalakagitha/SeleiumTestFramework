package com.shyamala.test.dataproviders;

import org.testng.annotations.DataProvider;

import com.shyamala.test.utils.ExcelUtilscommon;



public class DataProviders {
	
private static ExcelUtilscommon excelFileUtils = new ExcelUtilscommon(); 
	
	@DataProvider(name="InputData")
	public static Object[][] loginData() {
		String currentDir = System.getProperty("user.dir");
		String filePath = (currentDir + "/src/main/resources/com/shyamala/testData/DemoData.xls").replace('\\',
				'/');
		Object[][] arrayObject = excelFileUtils.getExcelData(filePath, "Sheet1");
		return arrayObject;
	}
}

