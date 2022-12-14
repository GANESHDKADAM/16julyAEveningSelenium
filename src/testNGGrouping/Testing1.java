package testNGGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 
{
  @Test(groups = "password")
  public void A() 
  {
	Reporter.log("this is A method is running", true);  
  }
  @Test(groups = "username")
  public void B()
  {
	  Reporter.log("this is B method is running", true);
  }
  @Test
  public void C()
  {
	  Reporter.log("this is C method is running", true);
  }
  @Test(groups = "username")
  public void D()
  {
	  Reporter.log("this is D method is running", true);
  }
}
