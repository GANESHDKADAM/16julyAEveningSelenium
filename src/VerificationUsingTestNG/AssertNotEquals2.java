package VerificationUsingTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertNotEquals2 
{
  @Test
  public void testing() 
  {
	  String a="undirwadi";
	  String b="undirwadi";
	  org.testng.Assert.assertNotEquals(a, b,"a and b are same then TC is failed");
	  
  }
}
