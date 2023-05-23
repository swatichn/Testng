package com.training.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
//import com.training.pages.CreateAccountPage;
import com.training.pages.CreateOppPage;

public class CreateOppTest extends BaseTest {
	
	WebDriver driver;

	CreateOppPage createopppage;

	
@BeforeMethod
public void beforemethod() {
		
		driver= getDriver("chrome");
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		createopppage = new CreateOppPage(driver);
}


//Testcase_15
@Test
public void oppportunitiesdropdown() {
	createopppage.Enterintousername();
	createopppage.Enterintopassword();
	createopppage.clicklogin();
	createopppage.opportunity();
	createopppage.prompt();
	createopppage.Opportunity1();
	
}

//Testcase_16
@Test
public void createnewOpportunity() throws InterruptedException {
	createopppage.Enterintousername();
	createopppage.Enterintopassword();
	createopppage.clicklogin();
	createopppage.opportunity();
	createopppage.prompt();
	createopppage.Createnewoppo();
	createopppage.opportunitydropdwn();
	createopppage.oppname();
	createopppage.searchaccountname();
	createopppage.closedate();
	createopppage.closedatetoday();
	createopppage.stage();
	createopppage.Probability();
	createopppage.Leadsrc();
	createopppage.Primarycampaign();
	createopppage.save();
}
//Testcase_17
@Test
public void TestpipelineReport() {
	createopppage.Enterintousername();
	createopppage.Enterintopassword();
	createopppage.clicklogin();
	createopppage.opportunity();
	createopppage.prompt();
	createopppage.opportunitypipeline();
	createopppage.Validate();
}
//Testcase_18
@Test
public void TestStuckOppo() {
	createopppage.Enterintousername();
	createopppage.Enterintopassword();
	createopppage.clicklogin();
	createopppage.opportunity();
	createopppage.prompt();
	createopppage.StuckOpportunity();
	createopppage.Validate1();
	
}
//Testcase-19
@Test
public void TestQuaterlySummary() throws InterruptedException {
    createopppage.Enterintousername();
    createopppage.Enterintopassword();
    createopppage.clicklogin();
    createopppage.opportunity();
    createopppage.prompt();
    createopppage.QuatsummaryInterval();
    createopppage.QuatsummaryInclude();
    createopppage.RunReport();
    createopppage.QuatsummaryInclude1();
    createopppage.RunReport1();
    createopppage.QuatsummaryInclude2();
    createopppage.RunReport2();
    createopppage.QuatsummaryInterval1();
    createopppage.QuatsummaryInclude3();
    createopppage.RunReport3();
    createopppage.QuatsummaryInclude4();
    createopppage.RunReport4();
    createopppage.QuatsummaryInclude5();
    createopppage.RunReport5();
}

}