package webDriverAllMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximiseorMinimise {

	public static void main(String[] args) throws InterruptedException 
	{System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://vctcpune.com/selenium/practice.html");
    driver.manage().window().maximize();
    Thread.sleep(1000);
    driver.manage().window().minimize();
}
		

	}


