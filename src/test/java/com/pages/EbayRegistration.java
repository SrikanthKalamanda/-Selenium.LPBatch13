package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EbayRegistration {
	   WebDriver driver;
	   @FindBy(xpath="//*[@id=\"gh-ug-flex\"]/a") WebElement registrationlink;
	   @FindBy(id="firstname") WebElement firstname;  ////*[@id="firstname"]
	   @FindBy(id="lastname") WebElement lastname;
	   @FindBy(xpath="//*[@id=\"Email\"]") WebElement email;
	   @FindBy(xpath="//*[@id=\"password\"]") WebElement password;
	   @FindBy(className="checkbox__control") WebElement checkbox;
//   @FindBy(xpath="//*[@id=\\\"EMAIL_REG_FORM_SUBMIT\\\"]") WebElement register;
	
	
	   
	public EbayRegistration(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);		
		
	}
	public void clickRegistrationLink() {
		registrationlink.click();
	}
	public void setFirstName(String input) {
		firstname.sendKeys(input);
		
	}
	  public void setLastName(String input) {
		  lastname.sendKeys(input);
	  }
	public void setEmail(String input) {
		email.sendKeys(input);
	}
	public void setPassword(String input) {
		password.sendKeys(input);
	}
	public void clickCheckBox() {
		checkbox.click();
		
	}
//	public void clickRegister() {
//		register.click();
//	}
	
}
