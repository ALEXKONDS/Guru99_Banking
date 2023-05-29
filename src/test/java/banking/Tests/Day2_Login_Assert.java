package banking.Tests;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import banking.Pages.LoginPage;
import banking.Pages.Utils;

public class Day2_Login_Assert {
	
	//Variables setup
	WebDriver driver;
	File screenshot;
	Utils utils;
	LoginPage loginpage;
	
	
	@Test(description = "Login attempt reading username and password from Utils class")
	public void loginAttempt() throws IOException {
		
		//Setting up Firefox profile
		ProfilesIni profile = new ProfilesIni();
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile.getProfile("Selenium"));
		driver = new FirefoxDriver(options);
		
		//Call util class for URL and browser setup
		utils = new Utils(driver);
		driver.get(utils.return_URL());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//Call loginAttempt method from LoginPage class, using username and password from Util class
		loginpage = new LoginPage(driver);
		loginpage.loginAttempt(utils.return_username(), utils.return_password());
		
		//Assert: Compare stored title in Utils class with the one showed in the browser
		Assert.assertEquals(utils.return_assertText_LoginSuccessful(), driver.getTitle());
		//Screenshot evidence: Login successful!
		screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(utils.return_evidenceFolder() + "Day 2\\login_successful.png"));
		

		driver.close();
		System.out.println("Test suite has ended!");
	}
	
}