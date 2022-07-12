package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteAppPinPage 
{

  //1.DATA MEMBERS
	
	@FindBy(id="pin") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
	
	
	//2.constructor
	public KiteAppPinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	
	
	//3.METHOD
	public void sendpin()
	{
		pin.sendKeys("982278");
	}
	
	public void clickoncontinueButton()
	{
		continueButton.click();
	}
	
	
	
	
}
