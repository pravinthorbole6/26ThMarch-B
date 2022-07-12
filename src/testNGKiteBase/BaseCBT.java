package testNGKiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;

public class BaseCBT 
{
	protected WebDriver driver;
	
	
	public void openBrowser(String browser)
	{   
		 if(browser.equals("firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\geckodriver.exe");
			   FirefoxOptions opt=new FirefoxOptions();
			    opt.addArguments("--disable-notifications"); 
			   driver=new FirefoxDriver(opt);
		  
		 }
		 else if(browser.equals("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");
			  ChromeOptions opt=new ChromeOptions();
			    opt.addArguments("--disable-notifications"); 
			  driver=new ChromeDriver(opt);
		 }
		
        driver.get("https://kite.zerodha.com/");
        Reporter.log("Launching browser",true);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
        
	}

}
