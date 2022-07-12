package testNgGrouping;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass1 
{
  @Test
  public void a()
  {
	  Reporter.log("a is running",true);
  }
  @Test(groups = "sanity")
  public void b()
  {
	 Assert.fail();
	  Reporter.log("b is running sanity",true);
  }
  @Test(groups = "Regression")
  public void c()
  {
	  Reporter.log("c is running regression",true);
  }
  @Test(groups="sanity")
  public void d()
  {
	  Reporter.log("d is running sanity",true);
  }
  
}
