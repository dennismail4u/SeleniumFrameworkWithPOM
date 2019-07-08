package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Test_Base;
import com.util.TestsUtil;


public class Login_Page extends Test_Base{
	
	WebDriverWait wait;
	
	//Page Factory - OR:
	@FindBy(xpath="//*[@src='/images/cogtiny1.jpg']")
	WebElement crmLogo;
	
	@FindBy(xpath="//*[contains(text(),'Log In')]")
	WebElement login;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[contains(text(),'Login')]")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	//Initializing the Page Objects:
	public Login_Page(){
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		TestsUtil.waitForElementToBeVisible(driver, crmLogo, TestsUtil.EXPLICIT_WAIT);
		return crmLogo.isDisplayed();
	}
	
	public Home_Page login(String un, String pwd){
		//When there was no wait, it was giving "ElementNotInteractableException" since the DOM was changing in milli seconds
		TestsUtil.waitForElementToBeVisible(driver, login, TestsUtil.EXPLICIT_WAIT);
		login.click();
		TestsUtil.waitForElementToBeVisible(driver, username, TestsUtil.EXPLICIT_WAIT);
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new Home_Page();
	}
	
	public String actualLoginPageTitle(){
		return driver.getTitle();
	}
	
}
