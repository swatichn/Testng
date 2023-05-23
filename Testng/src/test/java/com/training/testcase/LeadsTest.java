package com.training.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
//import com.training.pages.CreateOppPage;
import com.training.pages.LeadsPage;
import com.training.utilities.Commonutilities;

public class LeadsTest extends BaseTest {
   WebDriver driver ;
   
   LeadsPage leadspage;
   Commonutilities common= new Commonutilities();

	String url;

@BeforeMethod
public void beforemethod() throws IOException {
		
	driver= getDriver("chrome");
	url=getUrl();
	driver.get(url);
    
	leadspage = new LeadsPage(driver);
	//driver.findElement(By .id("username")).sendKeys("Suhani@great.com");
	//driver.findElement(By.id("password")).sendKeys("Automation23");
    //driver.findElement(By.id("Login")).click();
}
//Testcase_20
@Test
 public void Todayslead() throws InterruptedException {
	leadspage.Enterintousername();
	leadspage.Enterintopassword();
	leadspage.clicklogin();
	leadspage.leads1();
	leadspage.prompt();

}

//Testcase_21
@Test
public void leadselectview() throws InterruptedException {
	leadspage.Enterintousername();
	leadspage.Enterintopassword();
	leadspage.clicklogin();
	leadspage.leads1();
	leadspage.prompt();
	leadspage.dropdown();
	
}
//Testcase_22
@Test
public void DefaultView() throws InterruptedException {
	//leadspage.launch();
	leadspage.Enterintousername();
	leadspage.Enterintopassword();
	leadspage.clicklogin();
	leadspage.leads1();
	leadspage.prompt();
	leadspage.dropdown();
	leadspage.todaysleads();
	leadspage.Usermenu();
	leadspage.logout1();
	leadspage.Enterintousername1();
	leadspage.Enterintopassword();
	leadspage.clicklogin();
}
//Testcase_23
@Test
public void defaultview() throws InterruptedException {
	leadspage.Enterintousername();
	leadspage.Enterintopassword();
	leadspage.clicklogin();
	leadspage.leads1();
	leadspage.prompt();
	leadspage.dropdown();
	leadspage.todaysleads();
	leadspage.Go();
	//leadspage.Usermenu();
	
	}
//Testcase_24
@Test
public void checknew() throws InterruptedException {
	
	leadspage.Enterintousername();
	leadspage.Enterintopassword();
	leadspage.clicklogin();
	leadspage.leads1();
	leadspage.prompt();
	leadspage.createnew();
	leadspage.lead();
	leadspage.lastname();
	leadspage.company();
	leadspage.save();
}
//@AfterMethod
//public void aftermethod () throws InterruptedException {
	//driver.findElement(By.id("userNavLabel")).click();
     //Thread.sleep(5000);
     //driver.findElement(By.xpath("//a[text()='Logout']")).click(); 
     
     //driver.close(); 
//}
}