package banking.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Utils {

	//General variables
	String url = "https://www.demo.guru99.com/V4/";
	String evidenceFolder = "..\\Guru99.banking\\evidence\\";
	
	//Login variables (obsolete after 20 days)
	String username = "mngr505170";
	String password = "avymUqY";
	
	//Assert variables
	String assertText_LoginSuccessful = "Guru99 Bank Manager HomePage";
	String assertText_LoginFailed = "User or Password is not valid";
	
	//Excel variables
	String excel_FilePath = "..\\Guru99.banking\\excel\\Guru99_banking_loginData.xlsx";
	String excel_SheetName = "Hoja1";
	
	
	//Constructor
	public Utils (WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory (driver, 15), this);
	}
	
	
	//Actions
	public String return_URL() {
		return url;
	}
	
	public String return_evidenceFolder() {
		return evidenceFolder;
	}
	
	public String return_username() {
		return username;
	}
	
	public String return_password() {
		return password;
	}
	
	public String return_assertText_LoginSuccessful() {
		return assertText_LoginSuccessful;
	}
	
	public String return_assertText_LoginFailed() {
		return assertText_LoginFailed;
	}
	
	public String return_Excel_filepath() {
		return excel_FilePath;
	}
	
	public String return_Excel_sheetname() {
		return excel_SheetName;
	}
	
}