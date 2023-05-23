package com.training.pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class CreateAccountPage extends BasePage{

	public CreateAccountPage (WebDriver driver) {
		super(driver);
		}
    @FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement loginbutton;
	
	@FindBy (id="tsidLabel")
	WebElement content;
	
	@FindBy(id="Account_Tab")
	WebElement Account;
	
	@FindBy(id="tryLexDialogX")
	WebElement prompt;
	
	@FindBy(id="createNew")
	WebElement createnew;
	
	@FindBy(xpath="//a[@class='accountMru menuButtonMenuLink']")
	WebElement newaccount;
	
	@FindBy(id="acc2")
	WebElement Accountname;
	
	@FindBy(id="acc6")
	WebElement selectType;
	
	@FindBy(id="00NDm000005yNX0")
	 WebElement Customerpriorty;
	
	@FindBy(xpath="//a[text()='Create New View']")
	WebElement Createnewview;
	
	@FindBy(id="fname")
	WebElement viewname;
	
	@FindBy(id="devname")
	WebElement Uniqueviewname;
	
	@FindBy(xpath="//input[@class='btn primary'][1]")
	WebElement save;
	@FindBy(xpath="//select[@title='View:']")
	 WebElement View;
	
	@FindBy(xpath="//input[@type='submit'][1]")
	WebElement savebtn;
	
	@FindBy(xpath="//a[text()='Edit']")
	WebElement edit;
	
	@FindBy(id="fname")
	 WebElement Enterviewname;
	
	@FindBy(id="fcol2")
	WebElement AccountField;
	
	@FindBy(id="fop2")
	WebElement Operatordropdwn;
	
	@FindBy(id="fval2")
	WebElement Entervalue;
	
	@FindBy(xpath="//input[@class='btn primary'][1]")
	WebElement save1;
	
	@FindBy(xpath="//a[text()='Merge Accounts']")
	WebElement Merge;
	
	@FindBy(id="srch")
	WebElement mergeaccounttab;
	
	@FindBy(xpath="//input[@title='Find Accounts'][2]")
	WebElement Findaccounts;
	
	@FindBy(xpath="//input[@title='Next'][1]")
	WebElement next;
	
	@FindBy(id="cid0")
	WebElement clickonfirstflipkart;
	
	@FindBy(id="cid2")
	WebElement clickonflipkart1;
	
	@FindBy(xpath="//input[@value=' Merge '][1]")
	 WebElement Finalmerge;
	@FindBy(xpath="//select[@class='title']")
	WebElement View2;
	
	@FindBy(id="00BDm0000046WP5_listSelect")
	WebElement validate;
	
	@FindBy(xpath="//a[text()='Accounts with last activity > 30 days']")
	WebElement Accountactivity;
	@FindBy(id="ext-gen152")
	WebElement calender;
	
	@FindBy(id="ext-gen276")
	WebElement todayFrom;
	
	@FindBy(id="ext-gen154")
	WebElement todaytodate;
	@FindBy(id="ext-gen286")
	WebElement rightclick;
	@FindBy(id="ext-gen292")
	WebElement todayto;
	@FindBy(id="ext-gen49")
	WebElement save3;
	@FindBy(id="saveReportDlg_reportNameField")
	WebElement reportname;
	@FindBy(xpath="//img[@class='infoIcon']")
	WebElement uniquereportname;
	@FindBy(xpath="//button[text()='Save and Run Report']")
	WebElement saveandrun;
	
	public void Enterintousername() {
		username.sendKeys("Suhani@great.com");
	}
	public void Enterintopassword() {
		password.sendKeys("Automation23");}
		
	public void clicklogin() {
			//waitElement(10,loginbutton);
			loginbutton.click();
		}
    public void content() {
    	content.click();
    }
    public void Account() {
    	waitElement(10,Account);
    	Account.click();
    	
    }
    public void prompt() {
    	waitElement(10,prompt);
    	driver.switchTo().activeElement();
    	prompt.click();
    }
    public void createnew() {
    	createnew.click();
    }
   // public void selectviewdropdown() {
    //	waitElement(10,selectviewdropdown);
    	//Select view=new Select(selectviewdropdown);
	    //view.selectByVisibleText("Myaccountview1");
    //}
    public void newaccount() {
    	newaccount.click();
    }
    public void Accountname() {
    	waitElement(10,Accountname);
    	Accountname.sendKeys("Tesla");
    }
    public void selectType() {
    	waitElement(10,selectType);
    	Select technology=new Select(selectType);
	    technology.selectByVisibleText("Technology Partner");
    }
    public void Customerpriorty() {
    	waitElement(10,Customerpriorty);
    	 Select high=new Select(Customerpriorty);
	     high.selectByValue("High");
    }
    public void savebtn() {
    	savebtn.click();
    }
    public void Createnewview() {
    	Createnewview.click();
    }
   public void  viewname() {
	   waitElement(10,viewname);
	 viewname.sendKeys("Myaccountview9");
}
   public void  Uniqueviewname() throws InterruptedException {
	 Thread.sleep(5000);
	 Uniqueviewname.click();
	 Uniqueviewname.clear();
	 Thread.sleep(5000);
	 Uniqueviewname.sendKeys("Myaccountview9");
}
   public void save() {
	save.click();
   
}
  public void  View() {
   Select view1=new Select(View);
	view1.selectByVisibleText("Myaccountview1");   
}
 public void edit() {
	edit.click();
	
}
  public void Enterviewname() throws InterruptedException {
	  Thread.sleep(5000);
	  WebElement Enterviewname=driver.findElement(By.id("fname"));
	   //Thread.sleep(5000);
	  Enterviewname.clear();
		Enterviewname.sendKeys("NewMain7");
		
  }
  public void AccountField () {
	Select accountfield=new Select(AccountField);
    accountfield .selectByVisibleText("Account Name");
  
}
   public void Operatordropdwn() {
	
     Select operatordropdwn=new Select(Operatordropdwn);
     operatordropdwn .selectByVisibleText("contains");
}
   public void Entervalue() {
	Entervalue.sendKeys("a");
}
  public void  save1() {
	save1.click();  
}
   public void Merge() {driver.findElement(By.xpath("//a[text()='Merge Accounts']"));
	 Merge.click(); 
}
   public void mergeaccounttab() { 
   mergeaccounttab .sendKeys("Flipkart");
   }
   public void  Findaccounts() throws InterruptedException {
	   Thread.sleep(5000);
	 Findaccounts.click(); 
}
   public void next () {
	 next.click();  
}
  public void  Finalmerge () throws InterruptedException {
	  Thread.sleep(5000);
	  Finalmerge.click();
	  driver.switchTo().alert().accept();
  }
	public void  View2() {
	// View.click();
    Select view1=new Select(View);
    view1.selectByVisibleText("Recently Viewed Accounts");
}
	public void clickonfirstflipkart() {
		clickonfirstflipkart.click();
	}
	public void clickonflipkart1() throws InterruptedException {
		Thread.sleep(5000);
		clickonflipkart1.click();
	}
   public void validate () {
	   String text =driver.getTitle();
	   System.out.println(text);
  
   }
   public void  Accountactivity() {
	Accountactivity.click();
}
   public void calender() throws InterruptedException {
	   Thread.sleep(5000);
		calender.click();
  		 
}
   public void todayfrom() {
		todayFrom.click();
}
    public void todaytodate() {
    	 todaytodate.click();
    }
    public void rightclick() {
	rightclick.click();
    
}
    public void  todayto() {
	todayto.click();
}
    public void save3() {
	save3.click();
}
    public void reportname() {
	reportname.sendKeys("Suhani2");
}
   public void uniquereportname() {
	uniquereportname.click(); 
}
    public void saveandrun() throws InterruptedException {
    	Thread.sleep(3000);
	saveandrun.click();
}
}