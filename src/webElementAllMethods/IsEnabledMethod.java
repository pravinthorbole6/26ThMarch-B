package webElementAllMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) throws InterruptedException 
	
	{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://auth.discoveryplus.in/login/");
	Thread.sleep(2000);
	driver.findElement(By.id("mobileNumber")).sendKeys("8888855555");
	driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
	WebElement getOTP=driver.findElement(By.xpath("//button[text()='Get OTP']"));
		boolean Result = getOTP.isEnabled();
		System.out.println("Result is "+Result);
		
		
		
		

	}

}
