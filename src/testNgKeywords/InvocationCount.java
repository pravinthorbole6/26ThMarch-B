package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount
{
  @Test(invocationCount = 5)
  public void d()
  {
	Reporter.log("d is running",true);  
	  
  }
}
