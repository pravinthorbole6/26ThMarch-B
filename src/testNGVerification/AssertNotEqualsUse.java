package testNGVerification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEqualsUse 
{
  @Test
  public void myMethod() 
  {
	String ExpectedResult="Testing" ;
	String ActualResult="Testing1";
	
	Assert.assertNotEquals(ExpectedResult, ActualResult,"Expected result and actual result matching,T.C is failed");;
	Reporter.log("Expected result and Actual result not matching,T.C is passed",true);  
	  
  }
}
