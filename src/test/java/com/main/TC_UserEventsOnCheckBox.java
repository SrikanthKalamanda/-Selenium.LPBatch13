package com.main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pages.UserEventsOnCheckBox;

public class TC_UserEventsOnCheckBox extends BaseClass {
	
	UserEventsOnCheckBox destqa;
	@Test(priority=1)
public void  checkingWed() {
		destqa=new UserEventsOnCheckBox(driver);
		destqa.checkwed();	
	}
	@Test(priority=2)
	public void selectMon() {
		destqa.selectmonday();
	}
	@Test(priority=3)
	public void selectRedAndOrange() {
		destqa.clickredandorange();
	}
	
}
