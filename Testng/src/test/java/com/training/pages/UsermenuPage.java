package com.training.pages;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class UsermenuPage extends BasePage {
	public UsermenuPage (WebDriver driver) {
		super(driver);
	}
    @FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement loginbutton;
	
	@FindBy(id="userNavLabel")
    WebElement usermenudropdown;
	
	@FindBy(id="userNavMenu")
	WebElement Dropdownlist;
	
	@FindBy(xpath="//a[@href='/ui/setup/Setup?setupid=PersonalSetup'][1]")
	WebElement mysetting;
	
	@FindBy(id="PersonalInfo_font")
	WebElement personallink;
	
	@FindBy(id="LoginHistory_font")
	WebElement loginhistory;
	
	@FindBy(xpath="//a[@href='/servlet/servlet.LoginHistory?id=005Dm000001mvta']")
	WebElement downloadH;
	@FindBy(id="DisplayAndLayout_font")
	WebElement Display;
	@FindBy(id="CustomizeTabs_font")
	WebElement Customizetab;
	
	@FindBy(id="p4")
	WebElement Customapp;
	
	@FindBy(xpath="//select[@multiple='multiple'][1]")
	WebElement Availabletext;
	
	@FindBy(xpath="//img[@class='rightArrowIcon']")
	WebElement AddReport;
	
	@FindBy(name="save")
	WebElement save;
	
	@FindBy(xpath="//span[text()='Email']")
	WebElement Email;
	
	@FindBy(id="EmailSettings_font")
	WebElement EmailSetting;
	
	@FindBy(id="sender_name")
	WebElement Emailname;
	
	@FindBy(xpath="//input[@value='iamswatichn@gmail.com']")
	WebElement Emailadd;
	
	@FindBy(xpath="//input[@value=' Save ']")
	WebElement EmailRadiobutton;
	
	@FindBy(id="CalendarAndReminders_font")
	WebElement calender;
	
	@FindBy(id="Reminders_font")
	WebElement ActivityReminder;
	
	@FindBy(id="testbtn")
	WebElement TestReminder;
	
	@FindBy(xpath="//input[@title='Save']")
	WebElement savebutton;
	
	@FindBy(xpath="//a[text()='Developer Console']")
	WebElement developerconsole;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;
	@FindBy(xpath="//a[text()='My Profile']")
	WebElement profile;
	@FindBy(xpath="//img[@title='Edit Profile'][1]")
	WebElement EditProfile;
	@FindBy(id="contactInfoContentId")
	 WebElement iframe;	
	@FindBy(id="aboutTab")
	WebElement About;
	@FindBy(id="lastName")
	WebElement lastname1;
	@FindBy(xpath="//input[@value='Save All']")
	WebElement saveall;
	@FindBy(xpath="//span[text()='Post']")
	WebElement postlink;
	@FindBy(xpath="//iframe[@style='width: 100%; height: 100%;']")
	WebElement iframe1;
	@FindBy(xpath="//body[@style='height: auto; min-height: auto;']")
	WebElement Writepost;
	@FindBy(id="publishersharebutton")
	WebElement share;
	@FindBy(xpath="//span[text()='File']")
	WebElement file;
	@FindBy(id="chatterUploadFileAction")
	WebElement upload;
	@FindBy(id="chatterFile")
	WebElement choosefile;
	@FindBy(id="publishersharebutton")
	WebElement share1;
	@FindBy(id="displayBadge")
	WebElement photoclick;
	@FindBy(id="uploadPhotoContentId")
	WebElement iframe2;
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadInputFile']")
	WebElement choosefile1;
	@FindBy(id="j_id0:uploadFileForm:uploadBtn")
	WebElement save1;
	@FindBy(id="j_id0:j_id7:save")
	WebElement save3;
	public void Enterintousername() {
		username.sendKeys("Suhani@great.com");
	}
	public void Enterintopassword() {
		password.sendKeys("Automation23");}
		
		public void clicklogin() {
			//waitElement(10,loginbutton);
			loginbutton.click();
		}
	public void usermenu1() {
			waitElement(10,usermenudropdown);
			usermenudropdown.click();
	
}
    public void mysetting() {
	
    mysetting.click();
     }
    public void personallink() {
    	waitElement(10,personallink);
    	personallink.click();
    }
    public void loginhistory() {
    	loginhistory.click();
    }
    public void downloadH() {
    	downloadH.click();
    	
    }
    public void Display() {
    	Display.click();
    }
    public void Customizetab() {
		  Customizetab.click();
	 }
    public void Customapp() {
		  Customapp.click();
		  Select customapp=new Select(Customapp);
		    customapp.selectByVisibleText("Salesforce Chatter");
	 }
    public void Availabletext() {
    	 waitElement(10,Availabletext);
    	 Select Report=new Select(Availabletext);
 	    Report.selectByVisibleText("Reports");
 	  //  waitElement(10,Availabletext);
    }
    public void AddReport() {
    	AddReport.click();
    	
    }
    public void save() {
    	save.click();
    }
    public void Email() {
    	Email.click();
    }
    public void EmailSetting() {
    	waitElement(10,EmailSetting);
    	EmailSetting.click();
    }
    public void Emailname() {
       Emailname.clear();//Clearing the text entered in textbox
   	   Emailname.sendKeys("Test123");
   	     }
    public void Emailadd() {
       Emailadd.clear();
 	   Emailadd.sendKeys("iamswatichn@gmail.com");	
    }
    public void EmailRadiobutton() {
    	EmailRadiobutton.click();
    }
    public void calender() {
    	calender.click();
    }
    public void ActivityReminder() {
    	waitElement(10,ActivityReminder);
    	ActivityReminder.click();
    }
    public void TestReminder() {
    	TestReminder.click();
    }
    public void savebutton() {
    	driver.switchTo().activeElement();
    	savebutton.click();
    }
    public void developerconsole() {
    	developerconsole.click();
    	String parentWindow=driver.getWindowHandle();//
      //  waitElement(5,developerconsole);
        String childHandle= null;
        for(String handle:driver.getWindowHandles())
        	childHandle=handle;
        driver.switchTo().window(childHandle);
        driver.close();
    }
    public void logout() {
    	logout.click();
    	System.out.println(driver.getTitle());
    }
	public void Dropdownlist() {
		Dropdownlist.click();
		//Select Dropdownlist =new Select("userNavMenu");
		  
	     
	     List <WebElement> op = ((Select) Dropdownlist).getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);}
	  
	}
	 public void profile(){
     profile.click();     
	  
	}
	 public void EditProfile() throws InterruptedException {
		 Thread.sleep(3000);
     EditProfile.click();
}
	 public void  iframe() throws InterruptedException {
	 Thread.sleep(5000);
     driver.switchTo().frame(iframe);
}
	 public void About() {
     About.click();
}
	 public void  lastname1() {
     lastname1.clear();
     lastname1.sendKeys("Chouhan");
}
	 public void saveall() {
     saveall.click();}
	 
	 public void postlink() throws InterruptedException {
	 Thread.sleep(5000);
     postlink.click();
} 
	 public void iframe1() throws InterruptedException {
	 Thread.sleep(5000);
     
     driver.switchTo().frame(iframe1);
	 }
    public void  Writepost() throws InterruptedException {
    Writepost.sendKeys("Hello Team,We all did it");	
    Thread.sleep(5000);
    driver.switchTo().defaultContent();
}
    public void share() {
    
    share.click();
}    
    public void file() throws InterruptedException {
    Thread.sleep(5000);
    
     file.click();
} 
    public void upload() {driver.findElement(By.id("chatterUploadFileAction"));
    upload.click();
}   
  public void choosefile() throws InterruptedException { 
  Thread.sleep(8000);
  
  choosefile.sendKeys("C:\\Users\\schou\\OneDrive\\Desktop\\inspirational-quote.png");  
}
    public void share1() throws InterruptedException {
    Thread.sleep(5000);
   
    share1.click();
 }
   public void photoclick() throws InterruptedException {
   Thread.sleep(4000);
   photoclick.click();
}   
    public void iframe2() throws InterruptedException {
    Thread.sleep(4000);
    iframe2.click();
    driver.switchTo().frame(iframe2);
}
    public void  choosefile1() {
    choosefile1.sendKeys("C:\\Users\\schou\\OneDrive\\Desktop\\inspirational-quote.png");
}   
    public void  save1() throws InterruptedException {
    Thread.sleep(4000);
    WebElement save1=driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn"));
    save1.click();}
    public void save3() throws InterruptedException {
    Thread.sleep(4000);
    
    save3.click();}}