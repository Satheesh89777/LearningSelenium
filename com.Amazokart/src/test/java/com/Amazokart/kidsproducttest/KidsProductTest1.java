package com.Amazokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProductTest1 {
	@Test(priority =3,dependsOnMethods = "addproduct",enabled = false,groups="Smoke")
	public void deleteproduct()
	{
		  
		Reporter.log("DeleteProduct--kids PRD 1 sucessfuly",true);
	}
	@Test(priority =2,dependsOnMethods = "addproduct",groups="functionality")
     public void updateproduct()
      {
    	 Reporter.log("updateproduct--Kids PRD 1 sucessfuly",true);	
     }
	@Test(priority =1,invocationCount = 2,groups="integration")
     public void addproduct()
     {
		//Assert.fail();
    	 Reporter.log("Addproduct--kids PRD 1 sucessfully",true);
     }
	}
