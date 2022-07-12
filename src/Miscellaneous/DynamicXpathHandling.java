package Miscellaneous;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathHandling {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/search?q=iphone+12&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_HistoryAutoSuggest_1_1_na_na_na&otracker1=AS_QueryStore_HistoryAutoSuggest_1_1_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=iphone+12%7CMobiles&requestId=3b0b9c2a-91c0-4558-96b3-70c67672eb40&as-searchtext=i");
        Thread.sleep(1000);

        driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[6]")).click();
       Set<String> pages = driver.getWindowHandles();
        Iterator<String> results = pages.iterator();
        String output1 = results.next();
        String output2 = results.next();
        driver.switchTo().window(output2);
        driver.findElement(By.xpath("((//span[@class='_2_R_DZ'])[1]//span)[4]")).click();
        
        
        
        
        
	}

}