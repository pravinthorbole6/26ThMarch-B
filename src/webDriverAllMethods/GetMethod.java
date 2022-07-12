package webDriverAllMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		

	}

}
