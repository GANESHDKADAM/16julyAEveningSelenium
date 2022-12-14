package VerificationUsingTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertTrue 
{
  @Test
  public void testing() 
  {
	  boolean a=true;
	  
	  org.testng.Assert.assertTrue(a,"a is false then TC is failed");
	  
	 
	  
	  
  }
}
