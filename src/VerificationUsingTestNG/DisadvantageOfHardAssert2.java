package VerificationUsingTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class DisadvantageOfHardAssert2 
{
  @Test
  public void testing() 
  {
	  
    String a="undirwadi";
    String b="undirwadi";
    
     //if a and b are not equal and b is not null then TC is passed
    
    org.testng.Assert.assertNotEquals(a, b,"a and b are equal then Tc is failed");
    org.testng.Assert.assertNotNull(b,"b is not null then Tc is failed");
	  
	 
	  
	  
  }
}
