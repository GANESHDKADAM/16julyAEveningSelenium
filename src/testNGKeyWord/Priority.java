package testNGKeyWord;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority 
{
  @Test(priority = -5)
  public void F() 
  {
	  Reporter.log("this is my F method is running", true);
	  
  }
  @Test(priority = -2)
  public void D()
  {
	  Reporter.log("this is my D method is running", true);
  }
  @Test(priority = -3)
  public void E()
  {
	  Reporter.log("this is my E method is running", true);
  }
  @Test(priority = -6)
  public void A()
  {
	  Reporter.log("this is my A method is running", true);
  }
  @Test(priority = 3)
  public void C()
  {
	  Reporter.log("this is my C method is running", true);
  }
  @Test(priority = -4)
  public void B()
  {
	  Reporter.log("this is my B method is running", true);
  }
}
