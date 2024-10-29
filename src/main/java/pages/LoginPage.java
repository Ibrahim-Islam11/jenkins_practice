package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// WebElement Library:
	@FindBy(how = How.XPATH, using = "//input[@id = 'user_name']") WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id = 'password']") WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@id = 'login_submit']") WebElement SignInButton;
	
	// Methods to interact with elements:
	public void enterUsername(String username) {
		UserName.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void clickOnSignInButton() {
		SignInButton.click();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	
	

}
