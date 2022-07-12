package testNGVerification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification 
{
  @Test
  public void myMethod() 
  {
	String a="Pune"; 
	String b="Pune";
	  
	 Assert.assertEquals(a, b,"a and b not equal,T.C is failed");
	  
	  Assert.assertNull(b, "b is not null,T.C is failed");
  }
}
