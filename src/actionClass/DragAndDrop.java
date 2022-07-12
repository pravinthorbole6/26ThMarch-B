package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(1000);
		
        //FIND SOURCE AND DESTINATION 
       WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement destination = driver.findElement(By.id("amt8"));
		
		//How to drag and drop using Actions class
		//create object of Actions class and pass driver object
       Actions act=new Actions(driver);
		//act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
		
		act.dragAndDrop(source, destination).perform();
		
		
		
		
		
	}

}
