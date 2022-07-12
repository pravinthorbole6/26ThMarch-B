package webElementAllMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class onlineOrder {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9022395840");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aaivadil@123");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		Thread.sleep(1000);
	    driver.findElement(By.name("q")).sendKeys("Iphone12");
        driver.findElement(By.className("L0Z3Pu")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Green, 128 GB)']")).click();
        Thread.sleep(2000);
     driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


	}

