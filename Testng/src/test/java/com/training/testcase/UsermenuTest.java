package com.training.testcase;

import java.io.IOException;

//import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
//import com.training.pages.LoginPage;
import com.training.pages.UsermenuPage;
import com.training.utilities.Commonutilities;

public class UsermenuTest extends BaseTest{
	
	WebDriver driver;

	UsermenuPage usermenu;
	Commonutilities common= new Commonutilities();

	String url;
@BeforeMethod
public void beforemethod() throws IOException {
		
		driver= getDriver("chrome");
		//driver= getDriver("chrome"); //this is not working 
		 
		url=getUrl();
		driver.get(url);
		//driver.get("https://login.salesforce.com/");
		usermenu = new UsermenuPage(driver);

}
//testcase_5
@Test
 public void usermenu() {
	usermenu.Enterintousername();
	usermenu.Enterintopassword();
	usermenu.clicklogin();
	usermenu.usermenu1();
}

//Testcase_6

@Test
public void MyProfile() throws InterruptedException {
	usermenu.Enterintousername();
	usermenu.Enterintopassword();
	usermenu.clicklogin();
    usermenu.usermenu1();
    usermenu.profile();
	usermenu.EditProfile();
	usermenu.iframe();
	usermenu.About();
	usermenu.lastname1();
	usermenu.saveall();
	usermenu.postlink();
	usermenu.iframe1();
	usermenu.Writepost();
	usermenu.share();
	usermenu.file();
	usermenu.upload();
	usermenu.choosefile();
	usermenu.share1();
	usermenu.photoclick();
	usermenu.iframe2();
	usermenu.choosefile1();
	usermenu.save1();
	usermenu.save3();
}
//Testcase_7
@Test
public void MySetting() {
	usermenu.Enterintousername();
	usermenu.Enterintopassword();
	usermenu.clicklogin();
    usermenu.usermenu1();
    usermenu.mysetting();
    usermenu.personallink();
    usermenu.loginhistory();
    usermenu.downloadH();
    usermenu.Display();
    usermenu.Customizetab();
    usermenu.Customapp();
    usermenu.Availabletext();
    usermenu.AddReport();
    usermenu.save();
    usermenu.Email();
    usermenu.EmailSetting();
    usermenu.Emailadd();
    usermenu.EmailRadiobutton();
    usermenu.calender();
    usermenu.ActivityReminder();
    usermenu.TestReminder();
    usermenu.savebutton();
}
//Testcase_8
@Test
public void DeveloperConsole() {
	usermenu.Enterintousername();
	usermenu.Enterintopassword();
	usermenu.clicklogin();
    usermenu.usermenu1();
    usermenu.developerconsole();
}
//Testcase_9
@Test

public void Logoutoption() {
	usermenu.Enterintousername();
	usermenu.Enterintopassword();
	usermenu.clicklogin();
    usermenu.usermenu1();
    usermenu.logout();
}





}








//testcase_7
//@Test
//public void 


