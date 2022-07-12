package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
		
      //Find Element
        WebElement textBox = driver.findElement(By.id("autocomplete"));
        //textBox.sendKeys("Good Morning"); //using WebElement method
      //SENDKEYS BY USING ACTION CLASS
		Actions act=new Actions(driver);
        act.sendKeys(textBox, "Good Morning").perform();
		
		//HOW TO HANDLE DROP DOWN USING ACTION CLASS
        
        WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
		//act.click(dropdown).sendKeys(Keys.ARROW_DOWN).click(dropdown).sendKeys(Keys.ARROW_DOWN).build().perform();
		
		for(int i=0;i<=3;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();

	}

}
