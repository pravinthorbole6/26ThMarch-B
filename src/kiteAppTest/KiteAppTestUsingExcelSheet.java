package kiteAppTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppTestUsingExcelSheet {

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
		
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userID.sendKeys(UN);
		password.sendKeys(PWD);
		loginButton.click();
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		pin.sendKeys(PIN);
		continueButton.click();
		Thread.sleep(1000);

		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualResult = userName.getText();
       String expectedResult = UN;
       if(actualResult.equals(expectedResult))
       {
    	   System.out.println("USERID is matching,TC is passed");
       }
       else
       {
    	   System.out.println("USERID is not matching,TC is failed");
       }
        userName.click();
       Thread.sleep(500);
       driver.findElement(By.xpath("//a[@target='_self']")).click();
        driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
