package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEx1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.droiver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
		
		//how to find no. of rows in table
        List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		int totalNoOfRows = rows.size();
		System.out.println("Total no. of rows are "+totalNoOfRows);
		
		//how to find total no. of columns in table
		List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
		int totalNoOfColumns = columns.size();
		System.out.println("Total no of Columns are "+totalNoOfColumns);
		
		//how to read header
		for(WebElement header:columns)
		{
			System.out.print(header.getText()+" ");
		}
		
		//how to read all rows from table
		Iterator<WebElement> rowsdata = rows.iterator();
        while(rowsdata.hasNext())
        {
        	System.out.println(rowsdata.next().getText());
        }
		
		
		
		
		
		
		
	}

}

