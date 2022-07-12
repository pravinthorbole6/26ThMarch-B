package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\poi-bin-5.2.2\\data.xlsx");
		 String name = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println("Name is "+name);
		
		String character = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println("Character is "+character);

		 double Number = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		System.out.println("Number is "+Number);
		
		 boolean value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getBooleanCellValue();
		System.out.println("Boolean value is "+value);
		
	}

}
