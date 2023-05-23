package com.training.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class LeadsPage extends BasePage {
	public LeadsPage (WebDriver driver) {
		super(driver);
		}
     @FindBy(xpath="//a[text()='Leads']")
     WebElement leads;
     @FindBy(id="tryLexDialogX")
     WebElement prompt;
     @FindBy(id="fcf")
     WebElement dropdown;
     @FindBy(id="fcf")
     WebElement todaysleads;
     @FindBy(id="username")
	  WebElement username;
     @FindBy(id="username")
	  WebElement username1;
	 @FindBy(id="password")
	  WebElement password;
		
	 @FindBy(id="Login")
	 WebElement loginbutton;
	 @FindBy(xpath="//a[text()='Leads']")
     WebElement leads1;
	 @FindBy(id="tryLexDialogX")
     WebElement prompt1;
	 @FindBy(xpath="//input[@value=' Go! ']")
	 WebElement Go;
	 @FindBy(id="userNavLabel")
	 WebElement Usermenu;
	 @FindBy(id="userNavLabel")
	 WebElement Usermenu1;
	 @FindBy(xpath="//a[text()='Logout']")
	 WebElement logout;
	 
		
	 @FindBy(id="password")
	  WebElement password1;
		
	 @FindBy(id="Login")
	 WebElement loginbutton1;
	 @FindBy(xpath="//a[text()='Logout']")
	 WebElement logout1;
	 @FindBy(id="createNewButton")
	 WebElement createnew;
	 @FindBy(xpath="//a[@class='leadMru menuButtonMenuLink']")
	 WebElement lead;
	 @FindBy(id="name_lastlea2")
	 WebElement lastname;
	 @FindBy(id="lea3")
	 WebElement company;
	 @FindBy(xpath="//input[@value=' Save '][1]")
	 WebElement save;
	
	 public void Enterintousername() {
		 
		 username.sendKeys("Suhani@great.com");}
	
 
	public void Enterintopassword() {
	     password.sendKeys("Automation23");}
					
		public void clicklogin() {
		 loginbutton.click();}
     
    // public void leads() throws InterruptedException {
    	// Thread.sleep(3000);
		//leads.click();
		//}
     public void prompt() throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().activeElement();
		WebElement prompt=driver.findElement(By.id("tryLexDialogX"));
	    prompt.click();
	   
	   System.out.println("Title of page : " + driver.getTitle());
	   }
        public void  dropdown () {
	    dropdown .click();
	    Select dropdown1=new Select(driver.findElement(By.id("fcf")));
		   List <WebElement> dp = dropdown1.getOptions();
		      int size = dp.size();
		      for(int i =0; i<size ; i++){
		         String options = dp.get(i).getText();
		         System.out.println(options);}
        }
        public void todaysleads() {
        	
  		    Select todaysLeads=new Select(todaysleads);
  		    todaysLeads.selectByVisibleText("Today's Leads");
        }
        public void leads1() throws InterruptedException {
        	Thread.sleep(5000);
    		leads.click();
    		}  
        public void prompt1() throws InterruptedException {
    		Thread.sleep(5000);
    		driver.switchTo().activeElement();
    		WebElement prompt=driver.findElement(By.id("tryLexDialogX"));
    	    prompt.click();
    	   
}
        public void  Go() {
    	Go.click(); 
}
       public void Usermenu1() {
	     Usermenu1.click();    
}
       public void logout() throws InterruptedException {
    	 Thread.sleep(5000);
         logout.click(); 
 	     driver.quit();     
}
       public void Enterintousername1() throws InterruptedException {
	   Thread.sleep(5000);
	   username.sendKeys("Suhani@great.com");}
	  


	    public void Enterintopassword1() {
	     password.sendKeys("Automation23");}
					
		public void clicklogin1() {
		 loginbutton.click();
		 }
		 public void logout1() throws InterruptedException {
	    	 Thread.sleep(5000);
	         logout1.click(); 
	 	     //driver.close();     
	}
		  public void Usermenu() throws InterruptedException {
			  Thread.sleep(0);
			     Usermenu.click(); 
}
		  public void  createnew() {
		 	 createnew.click();
}
		public void  lead() {
	 	 lead.click();  
}
		public void lastname() {
	 	 lastname.sendKeys("ABCD");
}
		public void company() {
	 	 company.sendKeys("ABCD");
}
		public void save() {
	 	 save.click();
	 	System.out.println("Page title is :"+driver.getTitle());
}
}
	
