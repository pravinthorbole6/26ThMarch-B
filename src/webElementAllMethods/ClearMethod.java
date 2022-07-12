package webElementAllMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://www.facebook.com/");
	     driver.findElement(By.name("pass")).sendKeys("velocity@123");
	     Thread.sleep(1000);
         driver.findElement(By.name("pass")).clear();
	}

}
