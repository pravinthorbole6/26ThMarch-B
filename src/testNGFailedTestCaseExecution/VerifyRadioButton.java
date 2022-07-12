package testNGFailedTestCaseExecution;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyRadioButton {
  @Test
  public void radioButton() 
  {Assert.fail();
	  System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://vctcpune.com/selenium/practice.html");    
	  WebElement radiobutton = driver.findElement(By.xpath("//input[@value='Radio2']"));
	  radiobutton.click();
	  if(radiobutton.isSelected())
	  {
		  System.out.println("T.C is passed");
	  }
	 
  }
  
}
