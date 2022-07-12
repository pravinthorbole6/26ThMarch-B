package testNGKitePOM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import kiteAppPOMExcelSheet.KiteAppHomePage;
import kiteAppPOMExcelSheet.KiteAppLoginPage;
import kiteAppPOMExcelSheet.KiteAppPinPage;

public class ValidateUserName 
{
	WebDriver driver;
	org.apache.poi.ss.usermodel.Sheet mySheet;
	KiteAppLoginPage login;
	KiteAppPinPage pinpage; 
	 KiteAppHomePage homepage;
	@BeforeClass
	public void LaunchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--disable-notifications");
		opt.addArguments("incognito");

		 driver = new ChromeDriver();
        driver.get("https://kite.zerodha.com/");	
        Reporter.log("Launching Browser");
        File myFile=new File("C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\poi-bin-5.2.2\\data.xlsx");
		 mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
        
		  login=new KiteAppLoginPage(driver);
		 pinpage=new KiteAppPinPage(driver);
		 homepage=new KiteAppHomePage(driver);
	}
	@BeforeMethod
 public void LoginToKiteApp()
 {
		String UN = mySheet.getRow(3).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(3).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(3).getCell(2).getStringCellValue(); 
		
		login.senduserName(UN);
		Reporter.log("Sending User name",true);
		login.sendpassWord(PWD);
		Reporter.log("Sending Password",true);
		login.clickonloginButton();
		Reporter.log("Logging in..",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pinpage.sendpin(PIN);
		Reporter.log("Sending PIN",true);
		pinpage.clickoncontinueButton();
		Reporter.log("Clicking on Continue button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
 }
 
	@Test
  public void ValidateProfileName() throws InterruptedException 
	{
		String ExpectedUN=mySheet.getRow(3).getCell(0).getStringCellValue();
		String ActualUN=homepage.profileName.getText();
		Reporter.log("Validating User name",true);
		Assert.assertEquals(ActualUN, ExpectedUN,"Actual and Expected not matching,T.C is failed");
		Reporter.log("Actual and expected matching,T.C is passed",true);
		Thread.sleep(3000);
  }
	@AfterMethod
	public void logoutFromKiteApp() throws InterruptedException
	{homepage.clickonprofileName();
	Thread.sleep(1000);
	homepage.clickonlogoutButton();
	Reporter.log("logging out...",true);
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{    Thread.sleep(1000);
		Reporter.log("Closing Browser",true);
		driver.close();
	}
}
