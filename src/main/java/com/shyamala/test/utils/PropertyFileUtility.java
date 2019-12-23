package com.shyamala.test.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {;
	public String getPropertyValue(String key) {

		// String currentDir = System.getProperty("user.dir");
		String filePath = "C:\\Users\\serendipity\\Documents\\workspace-sts-3.9.9.RELEASE\\TestFramework\\src\\main\\resources\\com\\shyamala\\testData\\config.properties";
		File file = new File(filePath);

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop.getProperty(key);
	}


}



