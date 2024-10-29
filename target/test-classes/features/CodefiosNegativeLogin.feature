@codefiosNegativeLogin @regression
Feature: Codefios Negative Login Page Functionality Validation

Background:
	Given User is on Codefios login page
	
	@negativeLoginScenario1
	Scenario Outline: 1 - User should NOT be able to login with invalid credentials
		When User enters username as "<username>"
		When User enters password as "<password>"
		When User clicks on sign in button
		Then User should be landing on the dashboard page
		
	Examples:
		| username           | password |
		| demo1@codefios.com |  abc123  |
		| demo@codefios.com  |  abc124  |
		| demo1@codefios.com |  abc124  |
		|||
	
#	@negativeScenario2 @smoke
#	Scenario: 2 - User should NOT be able to login with invalid credentials
#		When User enters username as "demo@codefios.com"
#		When User enters password as "abc124"
#		When User clicks on sign in button
#		Then User should be landing on the dashboard page
#	
#	@negativeScenario3 @smoke
#	Scenario: 3 - User should NOT be able to login with invalid credentials
#		When User enters username as "demo1@codefios.com"
#		When User enters password as "abc122"
#		When User clicks on sign in button
#		Then User should be landing on the dashboard page
#		
#	@negativeScenario4 @smoke
#	Scenario: 3 - User should NOT be able to login with invalid credentials
#		When User enters username as ""
#		When User enters password as ""
#		When User clicks on sign in button
#		Then User should be landing on the dashboard page
		
	
