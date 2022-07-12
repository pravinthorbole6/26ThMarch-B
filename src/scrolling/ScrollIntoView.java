package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.Chrome.Driver","ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);

		WebElement Ref = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		
	JavascriptExecutor e = ((JavascriptExecutor)driver);
		e.executeScript("arguments[0].scrollIntoView(true);",Ref);
		
		WebElement rb = driver.findElement(By.xpath("//input[@value='Radio2']"));
		rb.click();
		WebElement textbox = driver.findElement(By.id("autocomplete"));
        textbox.sendKeys("Velocity");
		Thread.sleep(5000);
        //driver.close();
		
		
		
		
		
		
		
	}

}
