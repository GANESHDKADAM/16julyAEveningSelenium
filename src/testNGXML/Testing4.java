package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing4 
{
  @Test
  public void M() 
  {
	  Reporter.log("this is my M method", true); 
  }
  @Test
  public void N()
  {
	  Reporter.log("this is my N method", true);
  }
  @Test
  public void O()
  {
	  Reporter.log("this is my O method", true);
  }
  @Test
  public void P()
  {
	  Reporter.log("this is my P method", true);
  }
}
