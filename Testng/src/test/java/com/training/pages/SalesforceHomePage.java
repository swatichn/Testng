package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class SalesforceHomePage extends BasePage {

	public SalesforceHomePage(WebDriver driver) {
		
		super(driver);
		
	}
    @FindBy(id="userNavLabel")
    WebElement usermenu;
    
    @FindBy(xpath="//a[text()='Logout']")
    WebElement logout;
    
    public void usermenu() {
     usermenu.click();
}
    public void logout() {
    	
    	logout.click();
    }
	//private void wait(int timeout, WebElement logout2) {
		// TODO Auto-generated method stub
		
	}
