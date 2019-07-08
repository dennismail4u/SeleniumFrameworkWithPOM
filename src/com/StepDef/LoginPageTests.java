package com.StepDef;

import org.testng.Assert;

import com.base.Test_Base;
import com.pages.Home_Page;
import com.pages.Login_Page;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//For features plugin, need to download Naturals extension
//To import automatically for all and remove unwanted importes, just press Command+Shift+O (Or Ctl+Shift+O)
public class LoginPageTests extends Test_Base{
	Login_Page loginPage;
	Home_Page homePage;
	
	//Gloabl---can be moved to common place instead of here.
	@Before("@FreeCRM")       // This block runs before each scenario in feature file. Any feature file scenario can run first while running them all.
	public void setUp() throws Throwable {
		initialization();               //Opening browser and loading url before each scenario from any feature file.
	}
	
	@Before("@specialCase")
	public void specificPreCondition(){
		System.out.println("Only executes before @spcialCase tagged scenario");
	}
	
	@Given("^login$")
	public void login() throws Throwable {
		loginPage = new Login_Page();
	}

	@When("^CRM logo is present$")
	public void crm_logo_is_present() throws Throwable {
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	@Then("^verify the page title$")
	public void login_and_verify_the_page_title() throws Throwable {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM software for any Business");
	}

	@Then("^enter login credentials \"(.*)\" and verify home page label name$")
	public void enter_login_credentials_and_verify_home_page_label_name(String username) throws Throwable {
		homePage = loginPage.login(username, prop.getProperty("password"));   //Just passing only username from feature file to show parameterizing
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	//Gloabl -- runs after each scenario from any feature file. Can be moved to common place.
	@After("@FreeCRM")
	public void tearDown() throws Throwable {
		driver.quit();
	}
	
}
