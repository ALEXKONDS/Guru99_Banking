package banking.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {
	
	//Elements
	@FindBy(name = "uid") WebElement txtUserID;
	@FindBy(name = "password") WebElement txtPassword;
	@FindBy(name = "btnLogin") WebElement btnLogin;
	@FindBy(name = "btnReset") WebElement btnReset;
	
	
	//Constructor
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory (driver, 15), this);
	}
	
	
	//Actions
	public void loginAttempt(String userID, String password) {
		txtUserID.clear();
		txtUserID.sendKeys(userID);
		txtPassword.clear();
		txtPassword.sendKeys(password);
		btnLogin.click();
	}
		
}