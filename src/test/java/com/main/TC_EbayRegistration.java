 package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.pages.*;

public class TC_EbayRegistration extends BaseClass {

	EbayRegistration ebay;
     @Test(priority=1)
	public  void ebaytest() {				    
	     ebay=new EbayRegistration(driver);
	     ebay.clickRegistrationLink();	            
	}
     @Test(priority=2,dataProvider="getdata")
     public void detailsEntry(String fName,String lName,String email,String pass) {
    	 ebay.setFirstName(fName);
         ebay.setLastName(lName);
         ebay.setEmail(email);
         ebay.setPassword(pass);
     }  
     @Test(priority=3)
     public void checkBox() {
         ebay.clickCheckBox();
//         ebay.clickRegister();
     }
     @DataProvider
     public Object[][] getdata(){
    	 Object[][] data = new Object[1][4];
    	 
    	 data[0][0]="srikanth";

     	data[0][1]="kalamanda";
	
     	data[0][2]="test@test.com";
  	
     	data[0][3]="mercury";

		return data;
    	 
     }
}
