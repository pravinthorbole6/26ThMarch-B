package popUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/ ");
        Thread.sleep(1000);
	
		//Main page ID
		String mainpageid = driver.getWindowHandle();
		System.out.println(mainpageid);
		System.out.println("========================================");
		
		//to open child browser window
		driver.findElement(By.name("NewWindow")).click();
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Multiple pages IDs
		Set<String> multiIDs = driver.getWindowHandles();
      Iterator<String> ids = multiIDs.iterator();
     // while(ids.hasNext())
     // {
    //	  System.out.println(ids.next());
      //}
      //System.out.println("==================================");
      
      String mainpageID = ids.next();
      String childID = ids.next();
      
      //switch focus from main page to child browser
      driver.switchTo().window(childID);
      Thread.sleep(1500);
      driver.manage().window().maximize();
      Thread.sleep(5000);
      
      driver.findElement(By.xpath("//*[@id=\"the7-search\"]")).sendKeys("selenium");
      
      
      
      
      
      
	}

}

