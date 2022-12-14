package testNGKeyWord;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod 
{
  @Test(timeOut = 100)
  public void timeOut() throws InterruptedException 
  {
	  Thread.sleep(200);
	  Reporter.log("This is my time out method is running", true);
	  
  }
  @Test
  public void timeOut1()
  {
	  Reporter.log("This is my time out 1 method is running", true);
  }
  @Test(dependsOnMethods = {"timeOut","timeOut1"})
  public void timeOut2()
  {
	  Reporter.log("This is my time out 2 method is running", true);
  }
  @Test(timeOut = 300)
  public void timeOut3() throws InterruptedException
  {
	  Thread.sleep(150);
	  Reporter.log("this is my time out 3 method is running", true);
  }
  @Test
  public void timeOut4()
  {
	  Reporter.log("this is my time out 4 method is running", true);
	  
  }
}
