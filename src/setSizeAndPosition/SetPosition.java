package setSizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);

        System.out.println(driver.manage().window().getPosition());
		//To set  position ,we need to create object of point class and pass co-ordinates
        
		Point p=new Point(7, 3);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
		
		
		
		
		
		
		
		
		
	}

}
