package com.training.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class ContactsPage extends BasePage{

	public ContactsPage (WebDriver driver) {
		super(driver);
		}
	  @FindBy(id="username")
		WebElement username;
		@FindBy(id="password")
		WebElement password;
		@FindBy(id="Login")
		WebElement loginbutton;
		@FindBy(id="Contact_Tab")
		WebElement contact;
		@FindBy(id="tryLexDialogX")
		WebElement prompt ;
		@FindBy(id="createNewButton")
		WebElement createnew;
		@FindBy(xpath="//a[@class='contactMru menuButtonMenuLink']")
		WebElement Contact;
		@FindBy(id="name_lastcon2")
		WebElement NewLastname;
		@FindBy(id="con4")
		WebElement NewAccount;
		@FindBy(xpath="//input[@type='submit'][1]")
		WebElement save1;
		@FindBy(xpath="//a[text()='Create New View']")
		WebElement Createnewview;
		@FindBy(id="fname")
		WebElement viewname;
		@FindBy(id="devname")
		WebElement Uniqueviewname;
		@FindBy(xpath="//select[@name='hotlist_mode']")
		WebElement recentview;
		//h3[text()='Recent Contacts']
		@FindBy(xpath="//h3[text()='Recent Contacts']")
		WebElement Validate;
		@FindBy(id="fcf")
		WebElement dropdown;
		@FindBy(xpath="//a[text()='Chouhan']")
		WebElement contactname;
		@FindBy(xpath="//h2[@class='topName']")
		WebElement validate;
		@FindBy(xpath="//input[@maxlength='40']")
		WebElement viewname1;
		@FindBy(id="devname")
		WebElement Uviewname;
		@FindBy(xpath="//input[@value='Cancel'][1]")
		WebElement cancel;
		@FindBy(id="name_lastcon2")
		WebElement newcontact;
		@FindBy(id="con4")
		WebElement accountname;
		@FindBy(xpath="//input[@value='Save & New'][1]")
		WebElement saveandnew;
		@FindBy(id="errorDiv_ep")
		WebElement Error;
		
		public void Enterintousername() {
			username.sendKeys("Suhani@great.com");
		}
		public void Enterintopassword() {
			password.sendKeys("Automation23");}
			
		public void clicklogin() {
				//waitElement(10,loginbutton);
				loginbutton.click();
			}
		public void  contact() {
		   contact.click();
		}
		public void prompt() throws InterruptedException {
			 Thread.sleep(5000);
			   driver.switchTo().activeElement();
			   prompt.click();
		}
		public void  createnew() {
		  createnew.click();
		}
		public void Contact() {
		  Contact.click();
		}
		public void NewLastname() {
		  NewLastname.sendKeys("Chouhan");}
		
		public void NewAccount() {
		  NewAccount.sendKeys("Amazon");
		
}
		public void save1() {
			save1.click();	
		}
		 public void Createnewview() {
		 Createnewview .click();
		 System.out.println("Title of page is "+driver.getTitle());
		 }
		 public void  viewname() {
		 viewname.sendKeys("Suhani2.0");
		 }
		 public void Uniqueviewname() {
		 Uniqueviewname.sendKeys("");}
		 
		 public void  recentview() {
			Select recentlycreated=new Select(recentview);
			recentlycreated.selectByVisibleText("Recently Created");}
		 public void Validate() {
			String text  = driver.findElement(By.xpath("//h3[text()='Recent Contacts']")).getText();
	        System.out.println(text);}
		public void dropdown() {
		Select mycontacts=new Select(dropdown);
		mycontacts.selectByVisibleText("My Contacts"); }
		
		public void contactname(){driver.findElement(By.xpath("//a[text()='Chouhan']"));
	      contactname.click();}
		public void validate() {
	      String text=driver.findElement(By.xpath("//h2[@class='topName']")).getText();
	      System.out.println(text);}
		public void viewname1() {
		viewname.sendKeys("ABCD");}
		public void  Uviewname() {//changes this for 31 tc
	    Uviewname.click();
		Uviewname.clear();
		Uviewname.sendKeys("UVX");}
		public void validate2() {
			 String text=driver.findElement(By.xpath("//span[@style='font-weight: bold; font-size: 12pt;']")).getText();
			 System.out.println(text);
		}
       public void   cancel() {
		cancel.click();}
       public void  newcontact() {
	 	 newcontact.sendKeys("Indian");}
       public void  accountname() {
	 	 accountname.sendKeys("Global Media");}
       public void saveandnew() {
	 	saveandnew.click();}
       public void Error() throws InterruptedException {
    	Thread.sleep(5000);
   	 	String text=driver.findElement(By.id("errorDiv_ep")).getText();
   	 	System.out.println(text);
       }
}
