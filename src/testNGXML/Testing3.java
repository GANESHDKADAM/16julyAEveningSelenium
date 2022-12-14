package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing3 
{
  @Test
  public void I() 
  {
	  Reporter.log("this is my I method", true); 
  }
  @Test
  public void J()
  {
	  Reporter.log("this is my J method", true);
  }
  @Test
  public void K()
  {
	  Reporter.log("this is my K method", true);
  }
  @Test
  public void L()
  {
	  Reporter.log("this is my L method", true);
  }
}
