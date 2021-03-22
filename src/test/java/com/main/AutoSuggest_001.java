package com.main;


	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.pages.*;
import com.qa.utility.ExcelUtility;
	

	public class AutoSuggest_001 extends BaseClass {
		AutoSuggest search;
		
		@Test(priority=1 , dataProvider="getData")
		public void googlesearch(String text) {
			search=new AutoSuggest(driver);
			search.setsearchinput(text);
			List<WebElement> suggestions=search.getsuggestions();
			for(WebElement option:suggestions) {	
			Reporter.log(option.getText());
			search.setSearchSubmit();
			}		
		}
//		@DataProvider
//		public Object[] getData() {
//			Object[] data = new Object[1];
//			data[0]="Automation Testing";
//			return data;
//			
//		}
		@DataProvider
		public Object[][] getData(){
			Object[][] data = testData("C:\\Users\\vamshi\\Desktop\\Automation testing\\Book1.xlsx","Sheet1");
			return data;
		
		}
		public static Object[][] testData(String filePath,String sheetName){
			ExcelUtility EUtil = new ExcelUtility(filePath,sheetName);
			int rowCount = EUtil.getRowCount();
			int cellCount = EUtil.getColCount();
			
			Object data[][]= new Object[rowCount-1][cellCount];
			 for(int i=0;i<rowCount;i++) {
				 for(int j=0;j<cellCount;j++) {
					 String cellData = EUtil.getData(i,j);
					 
					 data [i-1][j]=cellData;
					 
				 }
			 }
			 return data;
		}
		
		}

