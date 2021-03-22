package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.pages.*;

public class ReddiffCompare extends BaseClass {

	Reddiff compare;
	
	

   @Test(priority=1 ,dataProvider="getData")
	public  void reddiff(String pass,String repass)  {   		
    		 compare=new Reddiff(driver);
    		 
    		compare.clickSignIn();
    			
    		compare.setPassword(pass);

    		compare.setRePassword(repass);
  
    		if(pass == repass) 
    			Reporter.log("test passed");
    		
    		else
    			Reporter.log("test failed");
   }
   @DataProvider
   public Object[] getData() {
	   Object[][] data=new Object[1][2];
	   data[0][0]="Srikanth@1";
	   data[0][1]="Srikanth@1";
	return data;
	
	   
   }
   
   
}
  		
    		
    		

    		    		

	


	

	
