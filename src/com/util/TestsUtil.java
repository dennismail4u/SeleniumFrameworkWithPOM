package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Test_Base;


public class TestsUtil extends Test_Base {

	public static long PAGE_LOAD_TIMEOUT = 10;
	public static int EXPLICIT_WAIT = 5;

	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	
	public static WebElement waitForElementToBeVisible(WebDriver driver, WebElement webElement, int seconds){
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
		return element;
	}
	
	public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement webElement, int seconds){
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
		return element;
	}

}
