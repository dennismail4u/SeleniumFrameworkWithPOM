Feature: FreeCRM HomePage Validations
	@FreeCRM @Regression
	Scenario: FreeCRM homepage positive scenario
	Given user on homepage
	Then verify homepage title
	And verify username label
	And verify contacts link