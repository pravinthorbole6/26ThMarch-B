package suiteLevelListeners;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteAppPOMExcelSheet.KiteAppHomePage;
import kiteAppPOMExcelSheet.KiteAppLoginPage;
import kiteAppPOMExcelSheet.KiteAppPinPage;
import testNGKIteUtility.UtilityNew;
@Listeners(suiteLevelListeners.Listener.class)
public class ValidateKiteUserIdUsingPropertyFIle extends BaseNew1
{

	KiteAppLoginPage login;
	KiteAppPinPage pinpage;
	KiteAppHomePage homepage;
	//String TCID="555";
	
	@BeforeClass
	public void launchBrowser() throws IOException, InterruptedException
	{    openBrowser();
		 login=new KiteAppLoginPage(driver);
		 pinpage=new KiteAppPinPage(driver);
		 homepage=new KiteAppHomePage(driver);
	timer();
		}
	@BeforeMethod
	public void LoginToKiteApp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.senduserName(UtilityNew.getDataFromPropertyFile("UN"));
		//Reporter.log("Sending Username",true);
		login.sendpassWord(UtilityNew.getDataFromPropertyFile("PWD"));
		//Reporter.log("Sending password",true);
		login.clickonloginButton();
		//Reporter.log("clicking on Login button",true);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		timer();
		pinpage.sendpin(UtilityNew.getDataFromPropertyFile("PIN"));
		//Reporter.log("Sending PIN",true);
		pinpage.clickoncontinueButton();
		//Reporter.log("Clicking on continue button",true);
		//Reporter.log("Logging In..",true);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		}
	@Test
  public void ValidateUserID() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		Assert.fail();
		Assert.assertEquals(homepage.profileName.getText(), UtilityNew.getDataFromPropertyFile("UN"),"Actual and expected username not matching,T.C is failed");
		//Reporter.log("Actual and expected matching,T.C is passed",true);
		//UtilityNew.captureScreenshot(driver, TCID);
  }
	@AfterMethod
	public void LogoutFromKiteApp()throws InterruptedException
	{   
		homepage.clickonprofileName();
		//Thread.sleep(1000);
		homepage.clickonlogoutButton();
		//Reporter.log("Logging Out..",true);
		}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		//Reporter.log("Browser closing..",true);
	}
}
