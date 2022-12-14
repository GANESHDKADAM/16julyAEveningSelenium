package VerificationUsingTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertEquals 
{
  @Test
  public void testing() 
  {
	  String a="undirwadi";
	  String b="undirwadi";
	  org.testng.Assert.assertEquals(a, b,"a and b are not maching then TC is failed");
	  
  }
}
