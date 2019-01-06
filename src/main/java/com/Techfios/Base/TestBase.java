package com.Techfios.Base;

import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
		prop = new Properties();
		FileinputStream ip = new FileinputStream("C:\\Users\\mohza\\eclipse-workspace\\com.Techfios\\src\\main\\java\\com\\Techfios\\config\\config.properties");

		prop.load(FileinputStream);
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}

	public static void initialization() {
		String browsername = prop.getProperty("browser");
if(browsername.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Auto\\chromedriver.exe");	
}
}
	}
}
