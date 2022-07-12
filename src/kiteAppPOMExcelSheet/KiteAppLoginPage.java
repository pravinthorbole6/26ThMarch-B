package kiteAppPOMExcelSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteAppLoginPage 
{
     //1.DATA MEMBERS 
	@FindBy(id="userid")  private WebElement userName;
	@FindBy(id="password") private WebElement passWord;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	//2.CONSTRUCTORS
	public KiteAppLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.METHODSS
	public void senduserName(String UserName)
	{
		userName.sendKeys(UserName);
	}
	public void sendpassWord(String PassWord)
	{
		passWord.sendKeys(PassWord);
	}
	public void clickonloginButton()
	{
		loginButton.click();
	}
	
	
	
	
	
	
	
}
