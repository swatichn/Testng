package com.training.testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.CreateAccountPage;
//import com.training.pages.UsermenuPage;
import com.training.utilities.Commonutilities;

public class CreateAccountTest extends BaseTest {
	
	WebDriver driver;

	CreateAccountPage createaccountpage;
	Commonutilities common= new Commonutilities();

	String url;

	//private Object method;
@BeforeMethod
public void beforemethod() throws IOException {
	driver= getDriver("chrome"); //this is not working 
	 
	url=getUrl();
	driver.get(url);
		
		
		//driver= getDriver();
		//driver.get("https://login.salesforce.com/");
		createaccountpage = new CreateAccountPage(driver);
}
//testcase_10
@Test
public void createacc() {
	createaccountpage.Enterintousername();
	createaccountpage.Enterintopassword();
	createaccountpage.clicklogin();
	createaccountpage.content();
	createaccountpage.Account();
	createaccountpage.prompt();
	createaccountpage.createnew();
	createaccountpage.newaccount();
	createaccountpage.Accountname();
	createaccountpage.selectType();
	createaccountpage.Customerpriorty();
	createaccountpage.savebtn();
	
}
//Testcase_11
@Test
public void AccounT() throws InterruptedException {
	createaccountpage.Enterintousername();
	createaccountpage.Enterintopassword();
	createaccountpage.clicklogin();
	createaccountpage.Account();
	createaccountpage.prompt();
	createaccountpage.Createnewview();
	createaccountpage.viewname();
	createaccountpage.Uniqueviewname();
	createaccountpage.save();
}
//testcase_12
@Test
public void Editview() throws InterruptedException {
	createaccountpage.Enterintousername();
	createaccountpage.Enterintopassword();
	createaccountpage.clicklogin();
	createaccountpage.Account();
	createaccountpage.prompt();
	createaccountpage.View();
	//createaccountpage.selectviewdropdown();
	createaccountpage.edit();
	createaccountpage.Enterviewname();
	createaccountpage.AccountField();
	createaccountpage.Operatordropdwn();
	createaccountpage.Entervalue();
	createaccountpage.save1();
}
//Testcase_13

@Test
public void CreateAccountReport() throws InterruptedException {
	createaccountpage.Enterintousername();
	createaccountpage.Enterintopassword();
	createaccountpage.clicklogin();
	createaccountpage.Account();
	createaccountpage.prompt();
	createaccountpage.Merge();
	createaccountpage.mergeaccounttab();
	createaccountpage.Findaccounts();
	createaccountpage.clickonfirstflipkart();
	createaccountpage.clickonflipkart1();
	createaccountpage.next();
	createaccountpage.Finalmerge();
	createaccountpage.View2();
	createaccountpage.validate();
	
}
// Testcase_14
@Test
public void createaccountreport() throws InterruptedException {
	createaccountpage.Enterintousername();
	createaccountpage.Enterintopassword();
	createaccountpage.clicklogin();
	createaccountpage.Account();
	createaccountpage.prompt();
	createaccountpage.Accountactivity();
	createaccountpage.calender();
	createaccountpage.todayfrom();
	createaccountpage.todaytodate();
	//createaccountpage.rightclick();
	//createaccountpage.todayto();
	//createaccountpage.save3();
	//createaccountpage.reportname();
	//createaccountpage.uniquereportname();
	//createaccountpage.saveandrun();
}

}

