 package com.training.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.training.utilities.Commonutilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	Commonutilities common= new Commonutilities();
	WebDriver driver;
	public WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		}
	    else if (browser.equalsIgnoreCase("firefox")) {
          WebDriverManager.firefoxdriver().setup();
		
		driver=new FirefoxDriver();}
		
		return driver;
	
	}
	 public String getUrl() throws IOException{
		 String url=common.getProperty("url");
		
		return url;
		
		
	}
	 public void takesscreenshot(WebDriver driver) {
		 TakesScreenshot screenshot =((TakesScreenshot)driver);//typecasting my driver to take screenshot 
		File scrFile= screenshot.getScreenshotAs(OutputType.FILE);
		Date currentDate=new Date();
		String timestamp= new SimpleDateFormat("yyyy-mm-dd hh-mm-ss").format(currentDate);
		String filepath="C:\\Users\\schou\\eclipse-workspace\\Testng\\Screenshot\\LoginScreenshot"+timestamp+".jpeg";
		File desFile=new File(filepath);
		try {
			FileUtils.copyFile(scrFile, desFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 }
}
