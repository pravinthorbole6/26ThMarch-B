package testNGKiteBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import suiteLevelListeners.UtilityNew1;
import testNGKIteUtility.UtilityNew;

public class BaseNew 
{
	protected WebDriver driver;
	
	
	public void openBrowser() throws IOException
	{    
	    ChromeOptions opt=new ChromeOptions();
	    opt.addArguments("--disable-notifications");
		 driver = new ChromeDriver(opt);
		 driver.get(UtilityNew1.getDataFromPropertyFile("URL"));
        Reporter.log("Launching browser",true);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
        
	}
	public static void captureScreenshot(WebDriver driver,String TCID) throws IOException
	  {
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File dest=new File("C:\\Users\\Pravin\\Documents\\SOFTWARE TESTING COURSE\\Selenium\\practice screenshots\\myScreenshot"+TCID+".png");
		  org.openqa.selenium.io.FileHandler.copy(src, dest);
		  
	  }
	
	
	

}
