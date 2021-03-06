package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Test_Base;


public class Contacts_Page extends Test_Base {

	@FindBy(xpath = "//*[class = 'ui linkedin button')]")
	WebElement contactsLabel;
	
	@FindBy(xpath = "//a/*[@class='ui linkedin button']")
	WebElement newBtn;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath = "//button[@class='ui linkedin button']")   
	WebElement saveBtn;
	
	
	
	// Initializing the Page Objects:
	public Contacts_Page() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyContactsLabel(){
		return contactsLabel.isDisplayed();
	}
	
	
	public void selectContactsByName(String name){
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}
	
	public void clickOnNewButton(){
		newBtn.click();
	}
	
	public void createNewContact(String ftName, String ltName){
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		saveBtn.click();
	}
	
	
	

}
