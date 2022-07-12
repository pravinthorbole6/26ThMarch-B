package webElementAllMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsdisplayedMethod {

	public static void main(String[] args) throws InterruptedException 
	{
    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(1000);	
	WebElement textbox = driver.findElement(By.name("show-hide"));	
		if(textbox.isDisplayed())
		{
			System.out.println("Your text box is displayed");
		}
		else
		{
			System.out.println("cant find textbox");
		}
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		hide.click();
		if(textbox.isDisplayed())
		{
			System.out.println("Youe text box is displayed");
		}
		
		else
		{
			System.out.println("cant find textbox");
		}
		
		
		
		
		
		
	}

}
