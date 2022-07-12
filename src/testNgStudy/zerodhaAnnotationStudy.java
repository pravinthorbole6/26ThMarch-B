package testNgStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class zerodhaAnnotationStudy {
  @Test(invocationCount = 5)
  public void AddFunds()
  {
	  Reporter.log("Fund Added successfully",true); 
  }
  @BeforeMethod
  public void LoginZerodha() 
  {
	  Reporter.log("Login successful",true);
  }

  @AfterMethod
  public void LogoutZeodha() 
  {
	  Reporter.log("Logout successful",true);  
  }

  @BeforeClass
  public void LaunchBrowser() 
  { Reporter.log("Launch browser",true);
  }

  @AfterClass
  public void closeBrowser() 
  { Reporter.log("closed successfullu",true);
  }

}
