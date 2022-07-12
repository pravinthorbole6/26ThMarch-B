package kiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteApp {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(2000);
		
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userID.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		loginButton.click();
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		pin.sendKeys("982278");
		continueButton.click();
		Thread.sleep(1000);
		
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualResult = userName.getText();
       String expectedResult = "ELR321";
       if(actualResult.equals(expectedResult))
       {
    	   System.out.println("USERID is matching,TC is passed");
       }
       else
       {
    	   System.out.println("USERID is not matching,TC is failed");
       }
       
       userName.click();
       Thread.sleep(500);
       driver.findElement(By.xpath("//a[@target='_self']")).click();
       
       driver.close();
	}

}
