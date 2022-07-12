package suiteLevelListeners;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import testNGKIteUtility.UtilityNew;

public class BaseNew1 
{
	static WebDriver driver;
	
	
	public void openBrowser() throws IOException
	{    
	    ChromeOptions opt=new ChromeOptions();
	    opt.addArguments("--disable-notifications");
	    System.setProperty("webdriver.chrome.droiver", "chromedriver.exe"); 
	    driver = new ChromeDriver(opt);
		 driver.get(UtilityNew.getDataFromPropertyFile("URL"));
        Reporter.log("Launching browser",true);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
        
	}
	
	 public void captureScreenshot(String value) throws IOException
	  {
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File dest=new File("C:\\Users\\Pravin\\Documents\\SOFTWARE TESTING COURSE\\Selenium\\practice screenshots\\myScreenshot"+value+".png");
		  org.openqa.selenium.io.FileHandler.copy(src, dest);
		  
	  }
	 public static void timer() throws InterruptedException
		{
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
   //Thread.sleep(5000);			
		}

	
	

}
