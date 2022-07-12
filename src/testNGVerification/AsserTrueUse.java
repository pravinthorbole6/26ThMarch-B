package testNGVerification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AsserTrueUse 
{
  @Test
  public void myMethod()
  {
	 boolean a=true;
	 boolean b=true;
	  
	 Assert.assertTrue(b, "b is false,T.C is failed");
	 Reporter.log("b is true,T.C is passed",true); 
  }
}
