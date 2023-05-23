package com.training.pages;

import org.openqa.selenium.WebDriver;

//import java.awt.Button;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.training.base.BasePage;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);}
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement loginbutton;
	
	@FindBy(id="error")
	WebElement errormessage;
	
	@FindBy(xpath="//input[@name='rememberUn']")
	WebElement Rememeberme;
	
    @FindBy(id="userNavLabel")
	    WebElement usermenu;
	    
	@FindBy(xpath="//a[text()='Logout']")
     WebElement logout;
	@FindBy(id="idcard-identity")
	WebElement Usernameafterlogout;
	
	@FindBy(id="forgot_password_link")
	WebElement ForgotPassword;
	
	@FindBy(id="un")
	WebElement Forgotpasswordusername;
	@FindBy(id="continue")
	WebElement Continue;
	@FindBy(id="username")
	WebElement Wronguser;
	@FindBy(id="password")
	WebElement Wrongpassword;
	@FindBy(xpath="//div[@aria-atomic='true'][1]")
	WebElement Wronguserpassworderrormessage;
	//@FindBy()
	
	public void Enterintousername(String stremail) {
		username.sendKeys(stremail);
	}
	public void Enterintopassword(String strpassword) {
		password.sendKeys(strpassword);
	}
	public void clicklogin() {
		//waitElement(10,loginbutton);
		loginbutton.click();
	}

    
	public void errormsg() {
    	//WebElement errormessage;
		String errormsg=errormessage.getText();
    	String expectedtext="Please enter your password.";
    	String actualtext=errormsg;
    	Assert.assertEquals(actualtext,expectedtext );
    }
   public void Rememberme() {
	   waitElement(10,Rememeberme);
	   Rememeberme.click();
     // waitElement(10,Rememeberme);
 }
   public void usermenu() {
	waitElement(10,usermenu);
	     usermenu.click();
	}
   public void logout1() {
	   waitElement(10,logout); 
	 logout.click();
	    }
   public void Usernameafterlogout() {
   	//WebElement errormessage;
	   waitElement(10,Usernameafterlogout);
		String checktext=Usernameafterlogout.getText();
   	String expectedtext="suhani@great.com";
   	String actualtext=checktext;
   	Assert.assertEquals(actualtext,expectedtext );	
}
     public void ForgotPassword() {
    	 ForgotPassword.click();
     }
     public void Forgotpasswordusername() {
    	 Forgotpasswordusername.sendKeys("Suhani@great.com");
     }
     public void Continue() {
    	 Continue.click();
     }
    public void Wronguser() {
    	//public void Enterintousername() {
    		username.sendKeys("123");
    
    }
   public void Wrongpassword() {
	   password.sendKeys("22131");
   }
   public void Wronguserpassworderrormessage() {
	   	//WebElement errormessage;
		   waitElement(10,Wronguserpassworderrormessage);
			String checktext=Wronguserpassworderrormessage.getText();
	String expectedtext="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	   	String actualtext=checktext;
	   	Assert.assertEquals(actualtext,expectedtext );	  
}

}