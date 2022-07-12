package setSizeAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
		
		System.out.println(driver.manage().window().getSize());
		
		//To set size ,we need to create object of dimension class and pass width and height as parameters
		Dimension d=new Dimension(600, 500);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		
		
		
		

	}

}
