Feature: FreeCRM Contacts Page Validations
	@FreeCRM @Regression
	Scenario: FreeCRM contacts page positive scenario
	Given user on the contacts Page
	Then user clicks on new button
	Then user fills firstname and lastname and save
	| testfirstname | testlastname |