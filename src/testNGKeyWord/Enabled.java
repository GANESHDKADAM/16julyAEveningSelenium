package testNGKeyWord;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled 
{
  @Test
  public void A() // this method is enabled then this is displayed in our console window
  {
	  Reporter.log("this is my A method is running", true);
  }
  @Test(enabled = false) // this method is enabled = false then this is not displayed in our console window
  public void B()
  {
	  Reporter.log("this is my B method is running", true);
  }
  @Test
  public void C()
  {
	  Reporter.log("this is my C method is running", true);
  }
  @Test(enabled = false)
  public void D()
  {
	  Reporter.log("this is my D method is running", true);
  }
  @Test(enabled = false)
  public void E()
  {
	  Reporter.log("this is my E method is running", true);
  }
  @Test(enabled = false)
  public void F()
  {
	  Reporter.log("this is my F method is running", true);
  }
}
