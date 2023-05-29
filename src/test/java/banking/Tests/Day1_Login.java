package banking.Tests;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;


public class Day1_Login {
	
	//Variables setup
	WebDriver driver;
	String url = "https://www.demo.guru99.com/V4/";
	String evidenceFolder = "..\\Guru99.banking\\evidence\\Day 1\\";
	File screenshotEvidence;
	
	@Test
	public void login_Succesful() throws IOException {
		
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.name("uid")).sendKeys("mngr505170");
		driver.findElement(By.name("password")).sendKeys("avymUqY");
		driver.findElement(By.name("btnLogin")).click();
		
		//Screenshot evidence: Login successful
		screenshotEvidence = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotEvidence, new File(evidenceFolder + "login_successful.png"));
		
		driver.close();
		
	}
	
}