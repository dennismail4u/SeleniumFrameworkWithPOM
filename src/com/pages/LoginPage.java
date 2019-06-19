package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.base.TestBase;
import com.util.TestUtil;

public class LoginPage extends TestBase{
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
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
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		TestUtil.waitForElementToBeVisible(driver, crmLogo, TestUtil.EXPLICIT_WAIT);
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		//When there was no wait, it was giving "ElementNotInteractableException" since the DOM was changing in milli seconds
		TestUtil.waitForElementToBeVisible(driver, login, TestUtil.EXPLICIT_WAIT);
		login.click();
		TestUtil.waitForElementToBeVisible(driver, username, TestUtil.EXPLICIT_WAIT);
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new HomePage();
	}
	
	public String actualLoginPageTitle(){
		return driver.getTitle();
	}
	
}
