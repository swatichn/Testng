package com.training.testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.training.base.BaseTest;
//import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.pages.SalesforceHomePage;
import com.training.utilities.Commonutilities;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest extends BaseTest{
	WebDriver driver;
	LoginPage loginpage;
	Commonutilities common= new Commonutilities();

	String url;

	@BeforeTest
	public void beforetest() {
		System.out.println("Test has beforetest");
	}
	
	
	@BeforeMethod (groups= {"smoke"})
	//@Parameters ({"browser"})
   public void 	beforemethod() throws IOException {
		
		
	driver= getDriver("chrome"); //this is not working 
	 
	url=getUrl();
	driver.get(url);
    loginpage=new LoginPage(driver);// do not give double quotes while passing the driver in ().
		
	}
	
	

	//we run this type set up in TestNg Xml
	//@Test(groups= {"smoke"})
	//@Parameters({"username"})
	//public void login(String username ) {
		//System.out.println(username);
		
	//}
   @Test 		
	public void login() {
		
	     loginpage.Enterintousername("Suhani@great.com");
		 loginpage.Enterintopassword(" ");
		 loginpage.clicklogin();
		 loginpage.errormsg();
	}
    @Test
    public void Sdfclogin() {
    	loginpage.Enterintousername("Suhani@great.com");//done in order to remove hardcoding
    	loginpage.Enterintopassword("Automation23");
    	loginpage.clicklogin();
    }
    
    //Testcase-3;
  @Test(groups= {"smoke1"})
    public void usermenu() {
    	loginpage.Enterintousername("Suhani@great.com");
    	loginpage.Enterintopassword("Automation23");
        loginpage.Rememberme();
    	loginpage.clicklogin();
    	loginpage.usermenu();
    	loginpage.logout1();
        loginpage.Usernameafterlogout(); 	
   
    	
    }
     //Testcase_4a
  @Test
   public void Forgotpassword() {
	  loginpage.ForgotPassword();
	  loginpage.Forgotpasswordusername();
	  loginpage.Continue();
	  
  }
   //Testcase_4b
  @Test
  public void WrongUserandpassword() {
	  loginpage.Wronguser();
	  loginpage.Wrongpassword();
	  loginpage.clicklogin();
	  loginpage.Wronguserpassworderrormessage();
	  
  }
  @AfterMethod
  public void teardown() {
	  takesscreenshot(driver); 
	  driver.close();
  }
}
