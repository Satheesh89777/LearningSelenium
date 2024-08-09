package com.Amazokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProductTest9 {
	@Test(groups = "integration")
	 public void addproduct()
    {
   	 Reporter.log("Addproduct--kids PRD 9 sucessfully",true);
    }
	
	@Test(groups = "functionality")
     public void updateproduct()
     {
    	 Reporter.log("updateproduct--Kids PRD 9 sucessfuly",true);	
     }
	@Test(groups = "Smoke")
	public void deleteproduct()
	{
		Reporter.log("DeleteProduct--kids PRD 9 sucessfuly",true);
	}
    
}
