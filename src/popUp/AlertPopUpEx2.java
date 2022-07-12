package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpEx2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        Thread.sleep(5000);
       
       
		
    	driver.findElement(By.xpath("//button[text()='Click me']")).click();
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		
		driver.findElement(By.id("confirmBox")).click();
		Alert a2=driver.switchTo().alert();
		System.out.println(a2.getText());
		a2.dismiss();
		
		driver.findElement(By.id("promptBox")).click();
		Alert a3=driver.switchTo().alert();
		System.out.println(a3.getText());
		a3.dismiss();		
		
		
		
		
		
		
		

	}

}
