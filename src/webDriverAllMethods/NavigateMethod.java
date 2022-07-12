package webDriverAllMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.navigate().to("http://www.facebook.com/");
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		Thread.sleep(500);
		driver.navigate().forward();
		driver.quit();
		
		
		

	}

}
