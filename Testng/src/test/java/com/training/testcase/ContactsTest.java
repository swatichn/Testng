package com.training.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.ContactsPage;
import com.training.utilities.Commonutilities;



public class ContactsTest extends BaseTest{
	WebDriver driver;

	ContactsPage contactspage;

	Commonutilities common= new Commonutilities();

	String url;
@BeforeMethod
public void beforemethod() throws IOException {
	driver= getDriver("chrome"); //this is not working 
	 
	url=getUrl();
	driver.get(url);
		
		//driver= getDriver();
		//driver.get("https://login.salesforce.com/");
		contactspage = new ContactsPage(driver);}
//Testcase_25
@Test
public void createnewcontact() throws InterruptedException {
	contactspage.Enterintousername();
	contactspage.Enterintopassword();
	contactspage.clicklogin();
	contactspage.contact();
	contactspage.prompt();
	contactspage.createnew();
	contactspage.Contact();
	contactspage.NewLastname();
	contactspage.NewAccount();
	contactspage.save1();
	
}
//Testcase_26
@Test
public void createnewview() throws InterruptedException {
	contactspage.Enterintousername();
	contactspage.Enterintopassword();
	contactspage.clicklogin();
	contactspage.contact();
	contactspage.prompt();
	contactspage.Createnewview();
	contactspage.viewname();
	contactspage.Uniqueviewname();
	contactspage.save1();
}
//Testcase_27
@Test
public void RecentCreatedContacts() throws InterruptedException {
	contactspage.Enterintousername();
	contactspage.Enterintopassword();
	contactspage.clicklogin();
	contactspage.contact();
	contactspage.prompt();
	contactspage.recentview();
	contactspage.Validate();
}
//Testcase_28
@Test
public void Mycontactsview() throws InterruptedException {
	contactspage.Enterintousername();
	contactspage.Enterintopassword();
	contactspage.clicklogin();
	contactspage.contact();
	contactspage.prompt();
	contactspage.dropdown();
	
}
//Testcase_29
@Test
public void ViewContact() throws InterruptedException {
	contactspage.Enterintousername();
	contactspage.Enterintopassword();
	contactspage.clicklogin();
	contactspage.contact();
	contactspage.prompt();
	contactspage.contactname();
	contactspage.validate();
}
//Testcase_30
@Test
public void CheckError() throws InterruptedException {
	contactspage.Enterintousername();
	contactspage.Enterintopassword();
	contactspage.clicklogin();
	contactspage.contact();
	contactspage.prompt();
	contactspage.Createnewview();
	contactspage.viewname1();
	contactspage.Uviewname();
	contactspage.save1();
	contactspage.validate2();
	
}
//Testcase_31
@Test
public void Checkcancelbutton() throws InterruptedException {
	contactspage.Enterintousername();
	contactspage.Enterintopassword();
	contactspage.clicklogin();
	contactspage.contact();
	contactspage.prompt();
	contactspage.Createnewview();
	contactspage.viewname1();
	contactspage.Uviewname();
	contactspage.cancel();
}
//Testcase_32
@Test
public void Newbutton() throws InterruptedException {
	contactspage.Enterintousername();
	contactspage.Enterintopassword();
	contactspage.clicklogin();
	contactspage.contact();
	contactspage.prompt();
	contactspage.createnew();
	contactspage.Contact();
	contactspage.newcontact();
	contactspage.accountname();
	contactspage.saveandnew();
	contactspage.Error();
}
@AfterMethod

public void teardown() throws InterruptedException {
	driver.findElement(By.id("userNavLabel")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[text()='Logout']")).click(); 
    
	
}
}