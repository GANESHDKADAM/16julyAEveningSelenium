package VerificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class SoftAssertUse 
{
	SoftAssert soft= new SoftAssert(); // create object of soft assert 
  @Test
  public void testing() 
  {
	 String a="undirwadi";
	 String b=null;
	 
	 // if a and b are not equals then TC is Passed and b is null then TC is Passed
	 
	 soft.assertNotEquals(a, b,"a and b are equal then TC is Failed");
	 soft.assertNull(b, "b is not null then TC is failed");
	 soft.assertAll(); 
  }
  @Test
  public void testing2()
  {
	  soft.fail();
	  soft.assertAll();
  }
}
