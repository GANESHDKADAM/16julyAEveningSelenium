
package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
public class Listener implements ITestListener
{
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		//String methodname = result.getName();
	Reporter.log("TC "+result.getName()+" is failed please try again...", true);
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
	Reporter.log("TC "+result.getName()+" is success...", true);
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
	Reporter.log("TC "+result.getName()+" is skipped please check", true);
	}

	
	

}
