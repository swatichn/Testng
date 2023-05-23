package com.training.base;

import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
 
	// private static final Function<? super WebDriver, Object> ExpecetedConditions = null;
	 protected WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void waitElement(int time,WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
    public void promptclose(WebDriver driver) {
    	driver.switchTo().activeElement();
    }
}
