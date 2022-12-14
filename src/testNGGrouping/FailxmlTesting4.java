package testNGGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailxmlTesting4 
{
  @Test
  public void E() 
  {
	Reporter.log("this is E method is running", true);  
  }
  @Test(timeOut = 200)
  public void F() throws InterruptedException
  {
	  Thread.sleep(400);
	  Reporter.log("this is F method is running", true);
  }
  @Test
  public void G()
  {
	  Reporter.log("this is G method is running", true);
  }
  @Test
  public void H()
  {
	  Reporter.log("this is H method is running", true);
  }
}
