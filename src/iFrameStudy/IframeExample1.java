package iFrameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample1 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/iframes/");
        Thread.sleep(1000);
		//1.performing action on main page
        
        String text1 = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
		System.out.println(text1);
		
		//2.switching focus from main page to 1st frame by (webElement method)
		driver.switchTo().frame("Framename1");
		Thread.sleep(2000);
		String text2 = driver.findElement(By.id("frametext")).getText();
		Thread.sleep(1000);
		System.out.println(text2);
	
		driver.switchTo().defaultContent();
		//3.switching focus from 1st frame to 2nd frame by (frame id)
	     driver.switchTo().frame("Frame2");
	     Thread.sleep(1000);
	      String text3 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
	      System.out.println(text3);
		
		
		//4.switching focus from 2nd frame to main page
	driver.switchTo().defaultContent();
      String text4 = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
     
     System.out.println(text4);
      
    
      
      
	}

}

 