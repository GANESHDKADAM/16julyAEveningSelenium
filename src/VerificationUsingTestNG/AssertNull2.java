package VerificationUsingTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertNull2 
{
  @Test
  public void testing() 
  {
	  String a="HI HOW ARE YOU";
	  
	  org.testng.Assert.assertNull(a,"a is not null then TC is failed");
	  
	  
  }
}
