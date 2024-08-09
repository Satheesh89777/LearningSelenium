package com.Amazokart.generic.ExcelUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SendDataToExcel {
	public static void main(String[] args) throws Throwable, IOException
	{
		//convert the physical excel file into java understandable

	FileInputStream fis=new FileInputStream("./src/test/resources/Data/TestDataa.xlsx");
	
	// create the work book
	Workbook book=WorkbookFactory.create(fis);
	
	//using workbook go to sheet,row,column and cell fetch the data
	String data=book.getSheet("studentdetails").getRow(1).getCell(2).getStringCellValue();
	
	//create a new column and write data
	book.getSheet("studentdetails").getRow(1).createCell(1).setCellValue("STATUS");
	
	// UPDATE THE EXISTING DATA IN EXCEL
	
	book.getSheet("studentdetails").getRow(1).getCell(2).setCellValue("FAIL");
	
	//CONVERT JAVA DATA INTO PHYSICAL FILE
	
	FileOutputStream fos=new FileOutputStream("./src/test/resources/Data/TestDataa.xlsx");
	
	//write the data
	book.write(fos);
	
	//close the workbook
	
	book.close(); 
	
	System.out.println(data);
	
	}
}
