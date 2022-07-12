package suiteLevelListeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener extends BaseNew1 implements ITestListener
{
    BaseNew1 b=new BaseNew1();
	@Override
		public void onTestSuccess(ITestResult result)
	{
			
			ITestListener.super.onTestSuccess(result);
			Reporter.log("congratulations,T.C is passed",true);
		}
 @Override
public void onTestFailure(ITestResult result)
 {
	
	ITestListener.super.onTestFailure(result);
	Reporter.log("T.c failed,Check Screenshot,T.C name is "+result.getName(),true);
	String value = result.getName();
	try {
		b.captureScreenshot( value);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
@Override
public void onTestSkipped(ITestResult result) 
{
	
	ITestListener.super.onTestSkipped(result);
	Reporter.log("T.C is skipped,T.C name is "+result.getName(),true);
}

}
