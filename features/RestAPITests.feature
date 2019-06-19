@RestAPITest
Feature: Rest API GET and POST test Validations
	Scenario: Rest API GET test Validations
	Given initiialize rest client
	Then validate getAPITestWithoutHeaders
	And validate getAPITestWithHeaders
	
	Scenario: Rest API POST test Validations
	Given initiialize rest client for POST
	Then validate postAPITest