package com.banking.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class testbase {
	
	public String username = "groupautomation";
	public String password = "Test@12345";
	public String url = "https://classic.freecrm.com";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tapan\\Desktop\\selenium practice\\bankingapp\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterClass
	public void teardown() 
	{
		driver.quit();
	}
}
