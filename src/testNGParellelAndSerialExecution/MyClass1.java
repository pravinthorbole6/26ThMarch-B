package testNGParellelAndSerialExecution;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyClass1 
{
  @Test
  public void myMethod() 
  {  
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
  }
}
