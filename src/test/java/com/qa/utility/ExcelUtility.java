package com.qa.utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
   XSSFWorkbook workBook;
   XSSFSheet sheet;
   
   public ExcelUtility(String excelPath,String sheetName) {
	   try {
		workBook=new XSSFWorkbook(excelPath);
		sheet=workBook.getSheet(sheetName);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	   
	   
   }
   public int getRowCount() {
	   int rowCount = sheet.getPhysicalNumberOfRows();
	   return rowCount;
	   
   }
   public int getColCount() {
	   int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
	   return cellCount;
	   
   }
   public String getData(int rowNum,int colNum) {
	   String stringCellValue = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	   return stringCellValue;
   }
//public String getCellData(int i, int j) {
//	// TODO Auto-generated method stub
//	return null;
//}
}
