package com.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;





public class BaseClass {
	WebDriver driver;

	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setup(String input, String Url) {
		if(input.equalsIgnoreCase("chrome")) {
		        System.setProperty("webdriver.chrome.driver", 
	            "C:\\Users\\vamshi\\Desktop\\Automation testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
	             driver=new ChromeDriver();	
	             driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	     		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	             driver.get(Url);
	}
	     else if(input.equalsIgnoreCase("edge"))  { 
	           System.setProperty("webdriver.edge.driver", 
	          "C:\\Users\\vamshi\\Desktop\\Automation testing\\Drivers\\edgedriver_win64\\edgedriver.exe");
	           driver=new EdgeDriver();	
	     }  		
		
		
		
	     }
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}
