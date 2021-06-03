package com.banking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
  public LoginPage(WebDriver rdriver) 
  {
	  ldriver = rdriver;
	  PageFactory.initElements(rdriver, this);
  }
  
  @FindBy(name="username")
  WebElement uname;
  
  @FindBy(name="password")
  WebElement pname;
  
  @FindBy(xpath="//input[@type='submit']")
  WebElement loginbtn;
  
  public void username(String un) 
  {
	  uname.sendKeys(un);
  }
  public void password(String pwd) 
  {
	  pname.sendKeys(pwd);
  }
  public void clicksubmit() 
  {
	  loginbtn.click();
  }
  
}
