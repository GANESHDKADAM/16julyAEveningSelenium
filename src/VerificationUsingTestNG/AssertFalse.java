package VerificationUsingTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertFalse 
{
  @Test
  public void testing() 
  {
	  boolean a=false;
	  
	  org.testng.Assert.assertFalse(a,"a is true then Tc is failed");
	  
	 
	  
	  
  }
}
