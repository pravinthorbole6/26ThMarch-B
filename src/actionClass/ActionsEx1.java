package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(1000);

         WebElement seleniumButton = driver.findElement(By.linkText("Selenium"));
		
		//seleniumButton.click();//clicking by using web element method
		
		//How to class by Action class method.
		//create object of action class and pass driver object
		Actions act=new Actions(driver);
		
		//using one of the required actions complete the process
		//1st method
		//act.moveToElement(seleniumButton).perform();
		//act.click().perform();
		
		//2.2nd method
		//act.moveToElement(seleniumButton).click().build().perform();
		 //3.3rd method
		//act.click(seleniumButton).perform();
		
		//HOW TO DOUBLE CLICK USING ACTION CLASS METHODS
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		//1.1st method
		//act.moveToElement(rightclickbutton).contextClick().build().perform();
		
		//2.2nd method
		//act.contextClick(rightclickbutton).perform();
		
		//HOW TO DOUBLE CLICK USING ACTION CLASS METHODS
		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//1st method
		//act.moveToElement(doubleclickbutton).doubleClick(doubleclickbutton).build().perform();
		
		//2.2nd method
		act.doubleClick(doubleclickbutton).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
