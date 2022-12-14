package VerificationUsingTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertNotNull2 
{
  @Test
  public void testing() 
  {
	  String a=null;
	  org.testng.Assert.assertNotNull(a,"a is null then TC is failed");
	  
	 
	  
	  
  }
}
