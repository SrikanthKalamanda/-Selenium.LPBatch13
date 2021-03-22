package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reddiff {

	WebDriver driver;
	WebDriverWait  wait;
	
	@FindBy(xpath="//*[@id=\"signin_info\"]/a[2]") WebElement signin;
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input") WebElement password;
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input") WebElement repassword;
	
	
	public Reddiff(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignIn() {
		
		signin.click();
	}
	public void setPassword(String input) {
		wait=new WebDriverWait(driver,500);
		wait.until(ExpectedConditions.visibilityOfAllElements(password));
		password.sendKeys(input);
	}
	public void setRePassword(String input) {
		wait=new WebDriverWait(driver,5000);
		wait.until(ExpectedConditions.visibilityOfAllElements(repassword));  
		repassword.sendKeys(input);
	}
	
	
}
