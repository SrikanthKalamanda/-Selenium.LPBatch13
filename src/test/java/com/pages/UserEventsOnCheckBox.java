package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class UserEventsOnCheckBox {
   WebDriver driver;
   @FindBy(xpath="//input[@name='groupName' and @value='Wed']") WebElement wednesday;
   @FindBy(xpath="//*[@id=\"daysofweek\"]/p[1]/input") WebElement monday;  
   @FindBy(xpath="//input[@name='groupName' and @value='Mon']") WebElement red;
   @FindBy(xpath="//*[@id=\"colors\"]/p[3]/input") WebElement yellow; 
   @FindBy(xpath="//input[@name='orange']") WebElement orange;
	
   public UserEventsOnCheckBox (WebDriver driver) {
	   this.driver=driver;
		PageFactory.initElements(driver,this);
   }
   public void checkwed() {
		boolean result=wednesday.isSelected();
		if (result) {
			Reporter.log("Wednesday radio is checked");			
		}
		else {		
		Reporter.log("Wednesday radio is not checked");		
	}	
	}	
   public void selectmonday(){	   
	   monday.click();
}	   		
   public void clickredandorange() {
		
	 boolean t1= red.isSelected();
	 boolean t2=yellow.isSelected();
	 boolean t3= orange.isSelected();
	 if (t1&&t2) {
		 Reporter.log("red and yellow are selected");}
	 else {
		 Reporter.log("either each of yellow and red is selected");}
	
	 orange.click();
	 yellow.click();
		 }		 
	 }

  