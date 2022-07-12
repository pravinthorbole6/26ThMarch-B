package testNGKiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base 
{
	protected WebDriver driver;
	
	
	public void openBrowser()
	{    System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
	    ChromeOptions opt=new ChromeOptions();
	    opt.addArguments("--disable-notifications");
		 driver = new ChromeDriver(opt);
        driver.get("https://kite.zerodha.com/");
        Reporter.log("Launching browser",true);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
        
	}

}
