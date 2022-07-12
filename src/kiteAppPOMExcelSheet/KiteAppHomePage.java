package kiteAppPOMExcelSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteAppHomePage 
{
  //1.DATA MEMBERS
	@FindBy(xpath = "//span[@class='user-id']")
	public WebElement profileName;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;
	
	
	
	
	
	
	
	//2.CONSTRUCTORS
	
  public KiteAppHomePage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	}
//3.METHODS


public void clickonprofileName() throws InterruptedException
  {
	  profileName.click();
	  Thread.sleep(2000);
  }
public void clickonlogoutButton()
{
	logoutButton.click();
}
public void gettextprofileName()
{
	System.out.println(profileName.getText());
}
public void validateprofileName(String UserName)
{
	String expectedresult=UserName;
	String actualresult=profileName.getText();
	
	if(expectedresult.equals(actualresult))
	{
		System.out.println("RESULTS ARE MATCHING ,TC IS PASSED");
	}
	else
	{
		System.out.println("RESULTS ARE NOT MATCHING ,TC IS FAILED");
	}
	
	
	
	
		
}

	
	
	

}
