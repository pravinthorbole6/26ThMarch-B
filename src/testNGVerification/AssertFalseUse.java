package testNGVerification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFalseUse 
{
  @Test
  public void myMethod() 
  {
	 boolean a=true;
	 boolean b=true;
	 
	 Assert.assertFalse(b, "b is true,T.c is failed");
	  Reporter.log("b is false,T.C is passed",true);
	  
	  
	  
  }
}
