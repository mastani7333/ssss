package com_StepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com_PageObjects.Adaction_LoginPage;
import io.cucumber.java.en.*;


public class AdactinLoginSteps {
	
	public static WebDriver driver;
	
	Adaction_LoginPage alp;
	
	@Given("user open browser")
	public void user_open_browser() {
		
		driver=new ChromeDriver(); 
	}

	@And("user open the application")
	public void user_open_the_application() {
	
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	//@When("user enters username and password")
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
	    
		//driver.findElement(By.id("username")).sendKeys("Venkat1997");
		//driver.findElement(By.id("password")).sendKeys("73A35C");
		
		alp=new Adaction_LoginPage(driver);
		
		alp.SetUsername(username);
		alp.SetPassword(password);
		
	}

	@And("user clicks the login button")
	public void user_clicks_the_login_button() {
	    
		alp.ClickLoginButton();
	}

	@Then("user should succussfully completed the login functionality")
	public void user_should_succussfully_completed_the_login_functionality() {
		
		System.out.println("login functionality successfully completed");
	   
	}

	@And("user should naviagated into Search Hotel page")
	public void user_should_naviagated_into_search_hotel_page() {
		
		
		String Exp_title= driver.getTitle();
		String Act_tittle= "Adactin.com - Search Hotel";
		
		if(Exp_title.equals(Act_tittle)) {
			
			Assert.assertTrue(true);
			
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
			Assert.assertTrue(false);
		}
	}

}
