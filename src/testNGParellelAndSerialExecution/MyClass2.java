package testNGParellelAndSerialExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass2 
{
  @Test
  public void myMethod() 
  {
	  System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
      driver.get("https://kite.zerodha.com/");  
  }
}
