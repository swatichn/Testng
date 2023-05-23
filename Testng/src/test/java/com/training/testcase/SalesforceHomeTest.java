package com.training.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.pages.SalesforceHomePage;

public class SalesforceHomeTest extends BaseTest {
	//private static final String SalesforceHomepage = null;
	WebDriver driver;
	LoginPage loginpage;
	
	SalesforceHomePage homepage;
	@BeforeMethod
   public void 	beforemethod() {
		
		driver= getDriver("");
		driver.get("https://login.salesforce.com/");
		loginpage=new LoginPage(driver);
		

}
//	@Test
	//public void usermenu() {
		// public void usermenu() {
		  //  	loginpage.Enterintousername();
		    //	loginpage.Enterintopassword();
		    	//loginpage.clicklogin();
		    	//loginpage.Rememberme();
		    	//homepage.usermenu();
		    	//homepage.logout();
	}
	
