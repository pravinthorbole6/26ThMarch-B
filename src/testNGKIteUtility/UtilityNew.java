package testNGKIteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityNew
{
  public static void captureScreenshot(WebDriver driver,String TCID) throws IOException
  {
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File dest=new File("C:\\Users\\Pravin\\Documents\\SOFTWARE TESTING COURSE\\Selenium\\practice screenshots\\myScreenshot"+TCID+".png");
	  org.openqa.selenium.io.FileHandler.copy(src, dest);
	  
  }
	
	
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myFile=new FileInputStream("C:\\Users\\Pravin\\eclipse-workspace\\SeleniumProject\\KiteAppProperties.properties");
		prop.load(myFile);
		String value=prop.getProperty(key);
		return value;
		
	}
	
	
	
	
	
	
}
