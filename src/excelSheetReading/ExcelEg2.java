package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	File myFile=new File("C:\\\\Users\\\\Pravin\\\\eclipse-workspace\\\\SeleniumProject\\\\poi-bin-5.2.2\\\\data.xlsx");
		
	Workbook book = WorkbookFactory.create(myFile);	
		Sheet mySheet = book.getSheet("Sheet2");
		Row myRow = mySheet.getRow(0);
		Cell myCell = myRow.getCell(1);
		System.out.println(myCell.getCellType());
		
		System.out.println("==========================================");
		
		//G=HOW TO READ MULTIPLE DATA FROM EXCELSHEET
		
		Sheet mySheet3 = book.getSheet("Sheet3");
		//outerloop -->rows
		//inner loop-->cells
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String value = mySheet3.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
