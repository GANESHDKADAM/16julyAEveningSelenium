package VerificationUsingTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertFalse2 
{
  @Test
  public void testing() 
  {
	  boolean a=true;
	  
	  org.testng.Assert.assertFalse(a,"a is true then Tc is failed");
	  
	 
	  
	  
  }
}
