package VerificationUsingTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertFail 
{
  @Test
  public void testing() 
  {
	  
	  org.testng.Assert.fail();
	  
  }
}
