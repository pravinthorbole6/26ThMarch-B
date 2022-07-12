package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(2000);
		
		KiteAppLoginPage login=new KiteAppLoginPage(driver);
		login.senduserName();
		login.sendpassWord();
		login.clickonloginButton();
		Thread.sleep(1000);
		
		KiteAppPinPage pinpage=new KiteAppPinPage(driver);
		pinpage.sendpin();
		pinpage.clickoncontinueButton();
		Thread.sleep(2500);
		KiteAppHomePage homepage=new KiteAppHomePage(driver);
		homepage.validateprofileName();
		homepage.getextprofileName();
		homepage.clickonprofileName();
		homepage.clickonlogoutButton();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
