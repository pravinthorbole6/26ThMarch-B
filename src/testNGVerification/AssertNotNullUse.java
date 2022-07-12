package testNGVerification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotNullUse 
{
  @Test
  public void myMethod()
  {
	String a="velocity";
	String b=null;
	
	Assert.assertNotNull(b, "b is null,T.C is failed");
	Reporter.log("b is not null,T.C is passed",true);  
	  
	  
	  
  }
}
