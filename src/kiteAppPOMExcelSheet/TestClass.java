package kiteAppPOMExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		File myFile=new File("C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\poi-bin-5.2.2\\data.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
		
		String UN = mySheet.getRow(3).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(3).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(3).getCell(2).getStringCellValue();
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(2000);
		
		KiteAppLoginPage login=new KiteAppLoginPage(driver);
		login.senduserName(UN);
		login.sendpassWord(PWD);
		login.clickonloginButton();
		Thread.sleep(1000);
		
		KiteAppPinPage pinpage=new KiteAppPinPage(driver);
		pinpage.sendpin(PIN);
		pinpage.clickoncontinueButton();
		Thread.sleep(2500);
		KiteAppHomePage homepage=new KiteAppHomePage(driver);
		homepage.validateprofileName(UN);
		homepage.gettextprofileName();
		homepage.clickonprofileName();
		homepage.clickonlogoutButton();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
