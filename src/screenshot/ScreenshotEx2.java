package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotEx2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/velocitycorporatetrainingcp/?hl=en");
        Thread.sleep(1000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String str=RandomString.make(4);
		File destination = new File("C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\src\\screenshot\\Testscreenshot"+str+".png");
		
		FileHandler.copy(src, destination);
		
		
		
	}

}
