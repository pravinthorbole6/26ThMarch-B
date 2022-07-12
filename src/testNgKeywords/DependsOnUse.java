package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnUse 
{
	 @Test
	  public void d() 
	  {
		  
		Reporter.log("d is running",true);  
		  
	  }
	  @Test(dependsOnMethods = {"v"},priority = -1)
	  public void a() throws InterruptedException 
	  {
		 Thread.sleep(2000); 
		Reporter.log("a is running",true);  
		  
	  }
	  @Test
	  public void v() 
	  {
		  
		Reporter.log("v is running",true);  
		  
	  }
	  @Test
	  public void p() 
	  {
		  
		Reporter.log("p is running",true);  
		  
	  }
	  
}
