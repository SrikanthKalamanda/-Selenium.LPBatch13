package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {
     WebDriver driver;
     
     @FindBy(id="twotabsearchtextbox") WebElement searchtextbox;
     @FindBy(id="nav-search-submit-button") WebElement magnifierbutton;
     
	public AmazonPages(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);

	}
     
     public void setSearchTextboxInput(String input) {
    	 searchtextbox.sendKeys(input);
     }
     public void setMagnifierButton() {
    	 magnifierbutton.click();
     }
     
     
     
}
