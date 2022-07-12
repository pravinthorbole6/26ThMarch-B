package testNGVerification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse 
{
  @Test
  public void myMethod() 
  {
	 int a=100;
	 int b=200;
	 
	 Assert.assertEquals(a, b,"a & b are not matching,T.C is failed");
	 Reporter.log("a & b are matching,T.C is passed",true);
	 
	 
  }
}
