package testNGVerification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AsserNullUse 
{
  @Test
  public void myMethod()
  {
	String a="velocity";
	String b=null;
	
	Assert.assertNull(b,"b is not null,T.C is failed");
	Reporter.log("b is null,T.C is passed");
	  
	  
	  
  }
}
