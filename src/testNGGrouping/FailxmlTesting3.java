package testNGGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailxmlTesting3 
{
  @Test(timeOut = 200)
  public void A() throws InterruptedException 
  {
	  Thread.sleep(500);
	Reporter.log("this is A method is running", true); 
	
  }
  @Test
  public void B()
  {
	  Reporter.log("this is B method is running", true);
	 
  }
  @Test(timeOut = 500)
  public void C() throws InterruptedException 
  {
	  Thread.sleep(600);
	  Reporter.log("this is C method is running", true);
  }
  @Test
  public void D()
  {
	  Reporter.log("this is D method is running", true);
  }
}
