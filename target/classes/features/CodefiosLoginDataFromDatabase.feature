@codefiosLoginWithDataFromDB
Feature: Codefios Login Page Functionality Validation with data from MySQL

	@codefiosLoginDBScenario1 @smoke
	Scenario: 1 - User should be able to login with valid credentials from DB
		Given User is on Codefios login page
		When User enters "username" from mysql database
		When User enters "password" from mysql database
		When User clicks on sign in button
		Then User should be landing on the dashboard page
	
		
	
