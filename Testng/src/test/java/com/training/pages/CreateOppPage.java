package com.training.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class CreateOppPage extends BasePage{

		public CreateOppPage (WebDriver driver) {
			super(driver);
			}
		
		 @FindBy(id="username")
		  WebElement username;
			
		 @FindBy(id="password")
		  WebElement password;
			
		 @FindBy(id="Login")
		 WebElement loginbutton;
		
		 @FindBy(xpath="//a[@title='Opportunities Tab']")
		 WebElement opportunity;
		 
		 @FindBy(id="tryLexDialogX")
		  WebElement prompt;
		 
		 @FindBy(id="fcf")
		 WebElement Opportunity1;
		 
		 @FindBy(id="createNewButton")
		 WebElement Createnewoppo;
		 @FindBy(xpath="//a[@class='opportunityMru menuButtonMenuLink']")
		 WebElement opportunitydropdwn;
		 @FindBy(id="opp3")
		 WebElement oppname;
		 
		 @FindBy(id="opp4")
		 WebElement searchaccountname;
		 @FindBy(id="opp9")
		 WebElement closedate;
		 @FindBy(xpath="//a[text()='Today']")
		 WebElement closedatetoday;
		 
		 @FindBy(id="opp11")
		 WebElement stage;
		 @FindBy(id="opp12")
		 WebElement Probability;
		 @FindBy(xpath="//img[@class='lookupIcon']")
		 WebElement Primarycampaign;
		 @FindBy(id="opp6")
		 WebElement Leadsrc;
		 @FindBy(xpath="//input[@class='btn']")
		 WebElement save;
		 @FindBy(xpath="//a[text()='Opportunity Pipeline']")
		 WebElement opportunitypipeline;
		 @FindBy(xpath="//a[text()='Stuck Opportunities']")
		 WebElement StuckOpportunity;
		 @FindBy(id="quarter_q")
		 WebElement QuatsummaryInterval;
		 @FindBy(id="open")
		 WebElement QuatsummaryInclude;
		 @FindBy(xpath="//input[@value='Run Report']")
		 WebElement RunReport;
		 @FindBy(id="open")
		 WebElement QuatsummaryInclude1;
		 @FindBy(xpath="//input[@value='Run Report']")
		 WebElement RunReport1;
		 @FindBy(id="open")
		 WebElement QuatsummaryInclude2;
		 @FindBy(xpath="//input[@value='Run Report']")
		 WebElement RunReport2;
		 @FindBy(id="quarter_q")
		 WebElement QuatsummaryInterval1;
		 @FindBy(id="open")
		 WebElement QuatsummaryInclude3;
		 @FindBy(xpath="//input[@value='Run Report']")
		WebElement RunReport3;
		 @FindBy(id="open")
		 WebElement QuatsummaryInclude4;
		 @FindBy(xpath="//input[@value='Run Report']")
		 WebElement RunReport4;
		 @FindBy(id="open")
		 WebElement QuatsummaryInclude5;
		 @FindBy(xpath="//input[@value='Run Report']")
		 WebElement RunReport5;
	 public void Enterintousername() {
	 username.sendKeys("Suhani@great.com");}
	public void Enterintopassword() {
     password.sendKeys("Automation23");}
				
	public void clicklogin() {
	 loginbutton.click();}
	
	public void  opportunity() {
		opportunity.click();
    }
	 public void prompt() {
	    	waitElement(10,prompt);
	    	driver.switchTo().activeElement();
	    	prompt.click();
	 }
    public void  Opportunity1() {
	  Opportunity1.click();
		Select Opportunity=new Select(driver.findElement(By.id("fcf")));
		 List <WebElement> op = Opportunity.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);}
     }
    public void Createnewoppo() {
    Createnewoppo.click();
    }
   public void opportunitydropdwn() {
    opportunitydropdwn.click();
}
    public void oppname() throws InterruptedException {
    	Thread.sleep(4000);
	oppname.sendKeys("1k-Amazonwidgets");   
}
    public void searchaccountname() {
    searchaccountname.sendKeys("Amazon");   
}
    public void  closedate() {
    closedate.click();   
}
    public void closedatetoday() {
    closedatetoday.click();
    }
    public void stage() throws InterruptedException {
    Thread.sleep(5000);
    driver.switchTo().activeElement();
    
    Select STAGE=new Select(stage);
    STAGE.selectByVisibleText("Qualification");
    }
    public void Probability() throws InterruptedException {
    
    Thread.sleep(5000);
    driver.switchTo().activeElement();
 
    driver.findElement(By.id("opp12")).clear();
     Probability.sendKeys("80");
    }
    public void Primarycampaign() throws InterruptedException {
    	Thread.sleep(5000);
	 Primarycampaign.click();
    }	
  //  public void magnifierwindow() throws InterruptedException {
    //	Thread.sleep(4000);
    	//driver.switchTo().activeElement();
    	//magnifierwindow.click();
    //}
    public void  Leadsrc() {
	 Select leadsrc=new Select(Leadsrc);
     leadsrc.selectByVisibleText("Partner Referral")	;
    }  
    public void  save() {
    save.click();
    
}
    public void opportunitypipeline() {
     opportunitypipeline.click();
}
    public void Validate() {
    	 System.out.println("Page title is : " + driver.getTitle());
     	 
 	     String actualTitle = driver.getTitle();
 	     String expectedTitle = "Opportunity Pipeline ~ Salesforce - Developer Edition";
 	     if(actualTitle.equalsIgnoreCase(expectedTitle))
	 		System.out.println("Title Matched" );
		 else
			System.out.println("Title didn't match.\n Expected Value: " + expectedTitle); 	
	}
    public void  StuckOpportunity() {driver.findElement(By.xpath("//a[text()='Stuck Opportunities']"));
	   StuckOpportunity.click();
    }
    public void Validate1() {
    	System.out.println("Page Title is :"+driver.getTitle());
		
		String ActualTitle="Stuck Opportunities ~ Salesforce - Developer Edition";
		String ExpectedTitle=driver.getTitle();
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle))
		     System.out.println("Title is same :"+ ActualTitle);
		     else
		    	 System.out.println("Title is not same :"+ ActualTitle);
    }
    public void QuatsummaryInterval() {
    QuatsummaryInterval.click();
    Select quatsummaryInterval=new Select(QuatsummaryInterval);
	quatsummaryInterval.selectByVisibleText("Current FQ");
    }
    public void  QuatsummaryInclude() throws InterruptedException {
    	Thread.sleep(5000);
    	Select quatsummaryInclude=new Select(QuatsummaryInclude);
		quatsummaryInclude.selectByVisibleText("All Opportunities");
    }
   public void  RunReport() throws InterruptedException {
   RunReport.click();
   Thread.sleep(5000);
   System.out.println("Title of page is :"+ driver.getTitle());
   driver. navigate(). back();
}
   public void QuatsummaryInclude1() {
	 Select quatsummaryInclude1=new Select(QuatsummaryInclude1);
	 quatsummaryInclude1.selectByVisibleText("Open Opportunities");
}
  public void  RunReport1() throws InterruptedException {
	 RunReport1.click();
	 Thread.sleep(5000);
	 System.out.println("Title of page is :"+ driver.getTitle());
	 driver. navigate(). back();
}
  public void  QuatsummaryInclude2() {
	 Select quatsummaryInclude2=new Select(QuatsummaryInclude2);
	 quatsummaryInclude2.selectByVisibleText("Closed Opportunities");
	
}
  public void RunReport2() throws InterruptedException {
	 RunReport2.click();
	 Thread.sleep(5000);
	 System.out.println("Title of page is :"+ driver.getTitle());
     driver. navigate(). back();}  

  public void QuatsummaryInterval1() throws InterruptedException {
	 QuatsummaryInterval1.click();
	 Thread.sleep(5000);		 	     	    
	 Select quatsummaryInterval1=new Select(QuatsummaryInterval1);
	 quatsummaryInterval1.selectByVisibleText("Next FQ");
	 }
  
  public void QuatsummaryInclude3() {
     QuatsummaryInclude3.click(); 
	 Select quatsummaryInclude3=new Select(QuatsummaryInclude3);
	 quatsummaryInclude3.selectByVisibleText("All Opportunities"); 
  
  }
  public void RunReport3() throws InterruptedException {
	 RunReport3.click(); 
	 Thread.sleep(5000);
	 driver. navigate(). back();     
	

}
  public void QuatsummaryInclude4() {
  Select quatsummaryInclude4=new Select(QuatsummaryInclude4);
  quatsummaryInclude4.selectByVisibleText("Open Opportunities");
}
  public void RunReport4() throws InterruptedException {
  RunReport2.click();
  Thread.sleep(5000); 	    
  driver. navigate(). back();
}
  public void QuatsummaryInclude5() {
  Select quatsummaryInclude5=new Select(QuatsummaryInclude5);
  quatsummaryInclude5.selectByVisibleText("Closed Opportunities");
}
  public void  RunReport5() {
  RunReport5.click();
	 
}
}