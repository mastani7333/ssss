package com_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adaction_LoginPage extends Adactin_BaseClass {
	
	//3.Parts
	//1.Constructor, 2. identify webelement 3.Create the actions
	
        public WebDriver driver;
        
        public Adaction_LoginPage(WebDriver driver) {
        	
        	super(driver);
        }
        
        
    //2. identify the webelements
        
      @FindBy(id="username")  
      WebElement txtUsername;
      
      @FindBy(id="password")
      WebElement txtPassword;
      
      @FindBy(id="login")
      WebElement btnLogin;

      //3.Create the actions
      
      public void SetUsername(String username) {
    	  
    	  txtUsername.sendKeys(username);
      }
      
      public void SetPassword(String password) {
    	  
    	  txtPassword.sendKeys(password);
      }
      
      public void ClickLoginButton() {
    	  
    	  btnLogin.click();
      }
}
