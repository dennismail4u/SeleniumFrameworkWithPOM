package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.util.TestsUtil;


public class Test_Base {
	
	public static WebDriver driver;
	public static Properties prop;

	//For Rest API
	public int RESPONSE_STATUS_CODE_200 = 200;
	public int RESPONSE_STATUS_CODE_500 = 500;
	public int RESPONSE_STATUS_CODE_400 = 400;
	public int RESPONSE_STATUS_CODE_401 = 401;
	public int RESPONSE_STATUS_CODE_201 = 201;
	
	public Test_Base(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/com/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Test Base");
	}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/DennisThomas/Documents/workspace/Drivers/chromedriver");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "/Users/DennisThomas/Downloads/geckodriver");	
			DesiredCapabilities capabilities=DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver(capabilities); 
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestsUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	
	
	
	

}
