package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(1000);
		
		driver.findElement(By.id("confirmButton")).click();
		
		//handling alert popup
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(alt.getText());
		alt.accept();
		
	
		

	}

}
