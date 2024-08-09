package com.Amazokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProductTest2 {
	@Test(enabled = false,groups="Smoke")
	 public void addproduct()
    {
   	 Reporter.log("Addproduct--kids PRD 2 sucessfully",true);
    }
	@Test(invocationCount = 2,priority = 1,groups="functionality")
     public void updateproduct()
     {
    	 Reporter.log("updateproduct--Kids PRD 2 sucessfuly",true);	
     }
	@Test(invocationCount = 2,priority = 2,groups="integration")
     public void deleteproduct()
 	{
 		Reporter.log("DeleteProduct--kids PRD 2 sucessfuly",true);
 	}
    
}
