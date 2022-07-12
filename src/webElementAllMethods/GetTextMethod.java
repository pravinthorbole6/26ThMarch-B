package webElementAllMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		String text=driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")).getText();
		System.err.println(text);
		
		
		
		
		
		

	}

}
