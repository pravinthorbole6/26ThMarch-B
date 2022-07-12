package testNGCrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
   @Parameters("browser")
	@Test
  public void myMethod(String browser) throws InterruptedException 
  {  WebDriver driver=null;
	 if(browser.equals("firefox"))
	 {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  
	 }
	 else if(browser.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");
		 driver=new ChromeDriver();
	 }
	 
	  driver.get("https://vctcpune.com/selenium/practice.html"); 
	  Thread.sleep(1000);
	  driver.close();
}
} 

