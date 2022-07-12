import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSTudy {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
        driver.findElement(By.xpath("//input[@value='Radio2']")).click();
       driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Velocity");
       driver.findElement(By.xpath("//option[@value='option1']")).click();
       driver.findElement(By.xpath("//input[@name='checkBoxOption3']")).click();
       
       
	}

}
