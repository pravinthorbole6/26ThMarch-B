package webElementAllMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedmethod {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement checkbox2 = driver.findElement(By.name("checkBoxOption2"));
		//checkbox2.click();
		if(checkbox2.isSelected())
		{
			System.out.println("check box 2 is selected");
		}
		else
		{
			checkbox2.click();
			System.out.println("check box 2 is now selected");
		}
			
		
		
		
		
		
		
	}

}
