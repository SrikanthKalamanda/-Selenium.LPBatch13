package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import com.pages.*;

public class TC_Amazon {
@Test
	public  void Amazon() {
		System.setProperty("webdriver.chrome.driver", 
	            "C:\\Users\\vamshi\\Desktop\\Automation testing\\Drivers\\chromedriver_win32\\chromedriver.exe");		
	            WebDriver driver=new ChromeDriver();
	            
	                 AmazonPages amazonOR=new AmazonPages(driver)  ;        
	                driver.get("https://www.amazon.in/");
	              amazonOR.setSearchTextboxInput("Books");
	              amazonOR.setMagnifierButton();

	}

}
