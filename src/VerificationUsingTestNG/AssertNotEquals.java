package VerificationUsingTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertNotEquals 
{
  @Test
  public void testing() 
  {
	  String a="undirwadi";
	  String b="UNDIRWAD";
	  org.testng.Assert.assertNotEquals(a, b,"a and b are same then TC is failed");
	  
  }
}
