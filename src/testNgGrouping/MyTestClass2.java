package testNgGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass2
{
	@Test(groups="regression")
	  public void x()
	  {
		  Reporter.log("x is running regression",true);
	  }
	  @Test(groups="sanity")
	  public void y()
	  {
		  Reporter.log("y is running sanity",true);
	  }
	  @Test
	  public void z()
	  {
		  Reporter.log("z is running",true);
	  }
	  @Test(groups="sanity")
	  public void w()
	  {
		  Reporter.log("w is running sanity",true);
	  }

	

}
