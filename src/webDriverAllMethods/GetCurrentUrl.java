package webDriverAllMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");
  WebDriver driver =new ChromeDriver();
  
  driver.get("https://vctcpune.com/selenium/practice.html");
  String Url=driver.getCurrentUrl();
  System.out.println("Current Url is "+Url);
  
  
  
  
  
	}

}
