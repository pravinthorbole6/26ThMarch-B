package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingStudy {

	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.Chrome.Driver","ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
       JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy(80,600)");
		
		
		
		
		
		
		
		
	

	}

}
