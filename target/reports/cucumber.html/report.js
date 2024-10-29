$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/CodefiosLoginDataFromDatabase.feature");
formatter.feature({
  "name": "Codefios Login Page Functionality Validation with data from MySQL",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@codefiosLoginWithDataFromDB"
    }
  ]
});
formatter.scenario({
  "name": "1 - User should be able to login with valid credentials from DB",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@codefiosLoginWithDataFromDB"
    },
    {
      "name": "@codefiosLoginDBScenario1"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Codefios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_is_on_Codefios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"username\" from mysql database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_from_mysql_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"password\" from mysql database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_from_mysql_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be landing on the dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_should_be_landing_on_the_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});