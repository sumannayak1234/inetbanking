package com.banking.testcases;

import org.testng.annotations.Test;

import com.banking.pageobjects.LoginPage;

import junit.framework.Assert;

public class Logintest_001 extends testbase {
	
	
	@Test
	public void loginTest() 
	{
		driver.get(url);
		LoginPage lp = new LoginPage(driver);
		lp.username(username);
		lp.password(password);
		lp.clicksubmit();
		if(driver.getTitle().equals("CRMPRO")) 
		{
			Assert.assertTrue(true);
		}else 
		{
			Assert.assertTrue(false);
		}
	}
}
