Feature: FreeCRM Login Validations
	#Below is data driven testing in cucumber without Example
	@SmokeTests @Regression @FreeCRM
	Scenario: FreeCRM login positive scenario with step parameter
	Given login 
	When CRM logo is present
	Then verify the page title
	Then enter login credentials "dennismail4u@gmail.com" and verify home page label name 

	#For data table example, look at contacts test.	
	#Below is with Examples and Scenario Outline	 [Just repeating above scenario only with examples]
	@FreeCRM @specialCase
	Scenario Outline: FreeCRM login positive scenario with Examples
	Given login 
	When CRM logo is present
	Then verify the page title
	Then enter login credentials "<username>" and verify home page label name 

	Examples:
	| username 				 |
	| dennismail4u@gmail.com |
	| test@test.com 		 |