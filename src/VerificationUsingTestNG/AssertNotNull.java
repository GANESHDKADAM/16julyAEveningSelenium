package VerificationUsingTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertNotNull 
{
  @Test
  public void testing() 
  {
	  String a="MY NAME IS GANESH";
	  org.testng.Assert.assertNotNull(a,"a is null then TC is failed");
	  
	 
	  
	  
  }
}
