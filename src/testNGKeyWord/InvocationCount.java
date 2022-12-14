package testNGKeyWord;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount 
{
  @Test(invocationCount = 5)  // this keyword is use to our test case in printed in five time
  public void invocationCount() 
  {
	  Reporter.log("this is invocationcount keyword use", true);
	  
  }
}
