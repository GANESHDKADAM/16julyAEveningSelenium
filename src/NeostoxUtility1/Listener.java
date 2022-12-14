
package NeostoxUtility1;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import NeostoxBase1.BaseClass2properties;
public class Listener extends BaseClass2properties implements ITestListener
{
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		//String methodname = result.getName();
	Reporter.log("TC "+result.getName()+" is failed please try again...", true);
	try {
		NeostoxUtility1.Utilitycommonmethod2properties.Takescreenshot(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
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
