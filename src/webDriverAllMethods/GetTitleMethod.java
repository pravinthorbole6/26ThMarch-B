package webDriverAllMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class GetTitleMethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");	
		
		String title =driver.getTitle();
		System.out.println("Title is "+title);
	}

}
