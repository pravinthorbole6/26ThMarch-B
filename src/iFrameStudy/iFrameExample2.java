package iFrameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrameExample2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        Thread.sleep(1000);
		//1.main page operation
	String t = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
		System.out.println(t);
		
		//2.frame1 operation
		
	driver.switchTo().frame("frame1");
	driver.findElement(By.xpath("/html/body/input")).sendKeys("Velocity");	
		
		//3.nested frame in frame1 operation
	driver.switchTo().frame("frame3");
	driver.findElement(By.id("a")).click();
		
		//frame 2 operations
	driver.switchTo().defaultContent();
	WebElement abc = driver.findElement(By.id("frame2"));
	driver.switchTo().frame(abc);
	WebElement ani = driver.findElement(By.xpath("//select[@id='animals']"));			
	Select s10=new Select(ani);
		s10.selectByIndex(3);
		
		
		
	
		
		
		
	}

}
