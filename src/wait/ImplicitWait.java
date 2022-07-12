package wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.Chrome.Driver","ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		

	}

}
