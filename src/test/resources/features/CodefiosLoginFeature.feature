@codefiosLoginFeature
Feature: Codefios Login Page Functionality Validation

	@loginFeature1 @smoke
	Scenario: 1 - User should be able to login with valid credentials
		Given User is on Codefios login page
		When User enters username as "demo@codefios.com"
		When User enters password as "abc123"
		When User clicks on sign in button
		Then User should be landing on the dashboard page
	@loginFeature2	
	Scenario: 2 - User should be able to login with valid credentials
		Given User is on Codefios login page
		When User enters username as "demo@codefios.com"
		When User enters password as "abc123"
		When User clicks on sign in button
		Then User should be landing on the dashboard page
		
	
