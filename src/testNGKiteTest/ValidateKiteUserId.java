package testNGKiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppPOMExcelSheet.KiteAppHomePage;
import kiteAppPOMExcelSheet.KiteAppLoginPage;
import kiteAppPOMExcelSheet.KiteAppPinPage;
import testNGKIteUtility.Utility;
import testNGKiteBase.Base;

public class ValidateKiteUserId extends Base
{

	KiteAppLoginPage login;
	KiteAppPinPage pinpage;
	KiteAppHomePage homepage;
	
	@BeforeClass
	public void launchBrowser()
	{    openBrowser();
		 login=new KiteAppLoginPage(driver);
		 pinpage=new KiteAppPinPage(driver);
		 homepage=new KiteAppHomePage(driver);
		}
	@BeforeMethod
	public void LoginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.senduserName(Utility.readDataFromExcel(3, 0));
		Reporter.log("Sending Username",true);
		login.sendpassWord(Utility.readDataFromExcel(3, 1));
		Reporter.log("Sending password",true);
		login.clickonloginButton();
		Reporter.log("clicking on Login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pinpage.sendpin(Utility.readDataFromExcel(3, 2));
		Reporter.log("Sending PIN",true);
		pinpage.clickoncontinueButton();
		Reporter.log("Clicking on continue button",true);
		Reporter.log("Logging In..",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		}
	@Test
  public void ValidateUserID() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		Assert.assertEquals(homepage.profileName.getText(), Utility.readDataFromExcel(3, 0),"Actual and expected username not matching,T.C is failed");
		Reporter.log("Actual and expected matching,T.C is passed",true);
		
  }
	@AfterMethod
	public void LogoutFromKiteApp()throws InterruptedException
	{
		homepage.clickonprofileName();
		Thread.sleep(1000);
		homepage.clickonlogoutButton();
		Reporter.log("Logging Out..",true);
		}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		Reporter.log("Browser closing..",true);
	}
}
