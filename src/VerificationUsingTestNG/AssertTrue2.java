package VerificationUsingTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertTrue2 
{
  @Test
  public void testing() 
  {
	  boolean a=false;
	  
	  org.testng.Assert.assertTrue(a,"a is false then TC is failed");
	  
	 
	  
	  
  }
}
