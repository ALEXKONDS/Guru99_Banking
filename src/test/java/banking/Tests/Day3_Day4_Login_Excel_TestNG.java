package banking.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
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
import Utilities.DataExcel;

public class Day3_Day4_Login_Excel_TestNG {

	//Variables setup
	WebDriver driver;
	File screenshot;

	//Class pages
	Utils utils;
	LoginPage loginpage;
	DataExcel dataexcel;
	
	
	@BeforeTest
	public void setUp() {
		//Setting up Firefox profile
		ProfilesIni profile = new ProfilesIni();
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile.getProfile("Selenium"));
		driver = new FirefoxDriver(options);
		
		//Call utils class for URL and browser setup
		utils = new Utils(driver);
		driver.get(utils.return_URL());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();		
	}
	
	
	@Test(description = "Login attempt reading username and password from Excel file", dataProvider = "Excel")
	public void loginAttempt(String userID, String password) throws IOException {
		
		//Call loginAttempt method from LoginPage class, using username and password from Excel file
		loginpage = new LoginPage(driver);
		loginpage.loginAttempt(userID, password);
		
		//Assert: Compare stored title in Utils class with the one showed in the browser
		Assert.assertEquals(utils.return_assertText_LoginSuccessful(), driver.getTitle());
		
		//Screenshot evidence: Take screenshot after login attempt
		screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(utils.return_evidenceFolder() + "Day 3\\loginSuccess.png"));
		
	}
	
	
	@AfterMethod
	public void returnHome() {
		driver.manage().deleteAllCookies();
		driver.get(utils.return_URL());
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();	
	}
	
	
	@AfterSuite
	public void endSuite() {
		System.out.println("Test suite has ended!");
	}
	
	
	@DataProvider(name = "Excel") 
	public Object[][] exceldata() throws Exception {
		return DataExcel.readExcel(utils.return_Excel_filepath(), utils.return_Excel_sheetname());
	}

	
}