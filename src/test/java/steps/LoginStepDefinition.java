package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	
	LoginPage loginPage;
	DatabasePage databasePage;
	
	@Before
	public void setUp() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		
	}

	@Given("User is on Codefios login page")
	public void user_is_on_Codefios_login_page() {
	//	initDriver();
		driver.get("https://codefios.com/ebilling/login");
	//	loginPage = PageFactory.initElements(driver, LoginPage.class);
		
	}

	@When("User enters {string} from mysql database")
	public void user_enters_from_mysql_database(String credential) {
		if(credential.equalsIgnoreCase("username")) {
			loginPage.enterUsername(new DatabasePage().getDataFromDatabase("user_name"));
		}
		else if(credential.equalsIgnoreCase("password")) {
			loginPage.enterPassword(new DatabasePage().getDataFromDatabase("user_password"));
		}
		else {
			System.out.println("Unable to retrieve data from DB");
		}
		
	}

//	@When("User enters {string} from mysql database")
//	public void user_enters_password_from_mysql_database(String password) {
//		loginPage.enterPassword(password);
		
//	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickOnSignInButton();
		
	}

	@Then("User should be landing on the dashboard page")
	public void user_should_be_landing_on_the_dashboard_page() {
		takeScreenshot(driver);
		String expectedTitle = "Codefios";
		String actualTitle = loginPage.getTitle();
		Assert.assertEquals("Titles Are Not Matching.", expectedTitle, actualTitle);
		
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
