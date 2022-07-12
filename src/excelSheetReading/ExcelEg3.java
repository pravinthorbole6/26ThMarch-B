package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		
		File myFile=new File("C:\\\\\\\\Users\\\\\\\\Pravin\\\\\\\\eclipse-workspace\\\\\\\\SeleniumProject\\\\\\\\poi-bin-5.2.2\\\\\\\\data.xlsx");
		Sheet mySheet4 = WorkbookFactory.create(myFile).getSheet("Sheet4");
		int totalNoOfRows = mySheet4.getLastRowNum();
		int rowsCount = totalNoOfRows;
		
		System.out.println("Total no. of rows are "+rowsCount);
		
		short totalNoOfCells = mySheet4.getRow(totalNoOfRows).getLastCellNum();
		int cellCount = totalNoOfCells-1;
		System.out.println("Total no. of cells are "+cellCount);
		
		System.out.println("=========================================");
		
		//outer for loop -->for rows
		//inner for loop--> for cells
		for(int i=0;i<=rowsCount;i++)
		{
			for(int j=0;j<=cellCount;j++)
			{
				Cell value = mySheet4.getRow(i).getCell(j);
				CellType dataType = value.getCellType();
				
				if(dataType==CellType.STRING)
				{
					String newvalue = value.getStringCellValue();
					System.out.print(newvalue+" ");
				}
				else if(dataType==CellType.NUMERIC)
				{
					double newvalue = value.getNumericCellValue();
					System.out.print(newvalue+" ");
				}
				else if(dataType==CellType.BOOLEAN)
				{
					boolean newvalue = value.getBooleanCellValue();
					System.out.print(newvalue+" ");
				}
				else if(dataType==CellType.BLANK)
				{
					System.out.print(" ");
				}
				
				
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		

	}

}
