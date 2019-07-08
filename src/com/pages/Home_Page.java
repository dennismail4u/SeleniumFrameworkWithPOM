package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Test_Base;
import com.util.TestsUtil;


public class Home_Page extends Test_Base {

	WebDriverWait wait;
	
	@FindBy(xpath = "//*[contains(text(),'Dennis Thomas')]")
	@CacheLookup
	WebElement userNameLabel;

	@FindBy(xpath = "//*[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;

	
	// Initializing the Page Objects:
	public Home_Page() {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 5);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName(){
		TestsUtil.waitForElementToBeVisible(driver, userNameLabel, TestsUtil.EXPLICIT_WAIT);
		return userNameLabel.isDisplayed();
	}
	
	public Contacts_Page clickOnContactsLink(){
		TestsUtil.waitForElementToBeVisible(driver, contactsLink, TestsUtil.EXPLICIT_WAIT).click();
		return new Contacts_Page();
	}
	
	public Deals_Page clickOnDealsLink(){
		dealsLink.click();
		return new Deals_Page();
	}
	
	public Tasks_Page clickOnTasksLink(){
		tasksLink.click();
		return new Tasks_Page();
	}
	
	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
	}
	
	
	
	
	
	
	

}
