package testNGKIteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility 
{

	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\poi-bin-5.2.2\\data.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	
	
}
