package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Eg1TestNg {
  @Test
  public void KiteLogin() 
  {

		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
      driver.get("https://kite.zerodha.com/");  
	  
      Reporter.log("Test case is passed", true);
  }
  @Test
  public void fbLogin()
  {
	  System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/login");  
	  
    Reporter.log("Test case is passed", true);  
  }
  
	  
  
}
