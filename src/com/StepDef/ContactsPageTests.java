package com.StepDef;

import java.util.List;

import com.base.Test_Base;
import com.pages.Contacts_Page;
import com.pages.Home_Page;
import com.pages.Login_Page;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactsPageTests extends Test_Base{
	Login_Page loginPage;
	Home_Page homePage;
	Contacts_Page contactsPage;
	
	@Given("^user on the contacts Page$")
	public void user_on_the_contacts_Page() throws Throwable {
		loginPage = new Login_Page();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactsPage = homePage.clickOnContactsLink();
	}
	
	@Then("^user clicks on new button$")
	public void user_clicks_on_new_button() throws Throwable {
		contactsPage.clickOnNewButton();
	}

	@Then("^user fills firstname and lastname and save$")
	public void user_fills_firstname_and_lastname_and_save(DataTable contactDetails) throws Throwable {
		List<List<String>> data =  contactDetails.raw();
		contactsPage.createNewContact(data.get(0).get(0), data.get(0).get(1));
	}
}
