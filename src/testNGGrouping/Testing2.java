package testNGGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing2 
{
  @Test(groups = "username")
  public void E() 
  {
	Reporter.log("this is E method is running", true);  
  }
  @Test(groups = "password")
  public void F()
  {
	  Reporter.log("this is F method is running", true);
  }
  @Test(groups = "username")
  public void G()
  {
	  Reporter.log("this is G method is running", true);
  }
  @Test(groups = "password")
  public void H()
  {
	  Reporter.log("this is H method is running", true);
  }
}
