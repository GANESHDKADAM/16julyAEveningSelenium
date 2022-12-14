package VerificationUsingTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertNull 
{
  @Test
  public void testing() 
  {
	  String a=null;
	  
	  org.testng.Assert.assertNull(a,"a is not null then TC is failed");
	  
	  
  }
}
