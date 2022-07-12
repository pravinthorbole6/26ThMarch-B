package testNGVerification;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse 
{
  @Test
  public void myMethod() 
  {
	  String a="Velocity";
	  String b="Velocity";
	  
	  SoftAssert soft=new SoftAssert();
	  
     soft.assertNotEquals(a, b,"a and b are matching,T.c is failed");
	 soft.assertNull(b,"b is null,T.C is failed");
	 soft.assertAll();	  
  }
  @Test
  public void myMethod1() 
  {
	  String a="Velocity";
	  String b="Velocity";
	  
	  SoftAssert soft=new SoftAssert();
	  
     soft.assertNotEquals(a, b,"a and b are matching,T.c is failed");
	 soft.assertNull(b,"b is null,T.C is failed");
	 soft.assertAll();
}
}
