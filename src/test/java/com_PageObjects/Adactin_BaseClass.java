package com_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Adactin_BaseClass {
	//open application,close application, screenshots
	
      //1.Constructor
	
	   public WebDriver driver;
	   public Adactin_BaseClass(WebDriver driver) {
		   
		  this.driver=driver;
		  
		  PageFactory.initElements(driver, this); 
	   }

}
