package com.StepDef;

import org.testng.Assert;

import com.base.Test_Base;
import com.pages.Contacts_Page;
import com.pages.Home_Page;
import com.pages.Login_Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageTests extends Test_Base {
	Login_Page loginPage;
	Home_Page homePage;
	Contacts_Page contactsPage;
	
	//test cases should be separated -- independent with each other
	@Given("^user on homepage$")
	public void user_on_home_page() throws Throwable {
		loginPage = new Login_Page();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Then("^verify homepage title$")
	public void verify_homepage_title() throws Throwable {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRM","Home page title not matched");
	}

	@And("^verify username label$")
	public void verify_username_label() throws Throwable {
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@And("^verify contacts link$")
	public void verify_contacts_link() throws Throwable {
		contactsPage = homePage.clickOnContactsLink();
	}
	

}
