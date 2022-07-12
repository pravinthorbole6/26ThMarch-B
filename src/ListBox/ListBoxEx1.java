package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEx1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(1000);
		
		//1.First name
		driver.findElement(By.name("firstname")).sendKeys("PRAVIN");
		Thread.sleep(1000);
		//2.Last Name
		driver.findElement(By.name("lastname")).sendKeys("THORBOLE");
		//3.Mobile no.
		driver.findElement(By.name("reg_email__")).sendKeys("9022395840");
		//4.Password
		driver.findElement(By.id("password_step_input")).sendKeys("pravin@123");
		//5.Select Birth Date
		WebElement date = driver.findElement(By.id("day"));
		Select s1=new Select(date);
		s1.selectByVisibleText("1");
		//6.Select birth month
		WebElement month = driver.findElement(By.id("month"));
	    Select s2=new Select(month);
	    s2.selectByIndex(4);
		//7.Select birth year
	    WebElement year=driver.findElement(By.name("birthday_year"));
	    Select s3=new Select(year);
	    s3.selectByVisibleText("1995");
	    //8.Select male
	    WebElement male=driver.findElement(By.xpath("//label[text()='Male']"));
	     male.click();
	    
		
		
		
	}}
	


