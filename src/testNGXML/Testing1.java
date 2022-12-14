package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 
{
  @Test
  public void A() 
  {
	  Reporter.log("this is my A method", true); 
  }
  @Test
  public void B()
  {
	  Reporter.log("this is my B method", true);
  }
  @Test
  public void C()
  {
	  Reporter.log("this is my C method", true);
  }
  @Test
  public void D()
  {
	  Reporter.log("this is my D method", true);
  }
}
