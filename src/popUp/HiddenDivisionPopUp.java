package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("Shirt for men");
        driver.findElement(By.tagName("svg")).click();
        
        
        
        
        
        
        
        
	}

}
