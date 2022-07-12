package Miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedList {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        Thread.sleep(1000);
		
        driver.findElement(By.name("q")).sendKeys("honda");
        Thread.sleep(500);
		
		List<WebElement> searchresults = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		System.out.println(searchresults.size());
		
		for(WebElement allresults:searchresults)
		{
			System.out.println(allresults.getText());
		}
		
		
		for(WebElement a:searchresults)
		{
			String actualresult = a.getText();
			String expectedresult = "honda city";
			
			if(actualresult.equals(expectedresult))
			{
				a.click();
				break;
			}
			}
		
			Thread.sleep(1500);
			driver.findElement(By.linkText("Images")).click();
			int nos = driver.findElements(By.tagName("img")).size();
			System.out.println(nos);
			
			
		
		
		

	

}
}
