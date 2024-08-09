package com.Amazokart.regester.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amazokart.generic.ExcelUtility.ReadExcelFile;
import com.Amazokart.generic.common.BaseClass_Register;
import com.Amazokart.generic.pagerepositor.Register_Page;
//@Listeners(com.Amazokart.generic.listnerUtility.Listners.class)
public class RegisterTest extends BaseClass_Register{
	
	
		@Test(enabled=false)
		public void createUser()
		{
			//Assert.fail();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//verify page using assert
			
			String exp_title="LEarning WEB TECHNOLOGY FORMS";
			String act_title=driver.getTitle();
			System.out.println(act_title);
			Assert.assertEquals(act_title, exp_title);
			
			//create object for Register
			
			Register_Page reg=new Register_Page(driver);
			
			//step1: clear the name in the neme textfield
			reg.getName().clear();
			
			
			
			//create an object for Excelutilityfile class
			
			ReadExcelFile excel=new ReadExcelFile();
			
			
			//step 2: write the name in the new text field
			reg.getName().sendKeys(excel.readdata("student", 1, 1));
			
			//step 3: display the email
			
			System.out.println(excel.readdata("student", 1, 2));
			
			//step 4: write the data
			excel.writedata("student", 2, 1,"himanshu");
			excel.writedata("student", 3, 2, "himanshu87363@gmail.com");
			
			Reporter.log("create User_validdata for Register Test",true);
		}
		
		
		//Step 1: identify name Textfiled
		//Step 2: indentify the email textFiled
		//Step 3: identify the password 
	//	@DataProvider(name="Register")
		@Test(dataProvider = "register")
		public void createUser_invalidData(String name,String email,String password)
		{
			Register_Page reg=new Register_Page(driver);
			
			reg.getName().clear();
			reg.getName().sendKeys(name);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			reg.getEmail().clear();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			reg.getEmail().sendKeys(email);
			
			
			reg.getPassword().clear();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		reg.getPassword().sendKeys(password);
			
			
			
//			//Step 1: identify name Textfiled
//			driver.findElement(By.id("name")).clear();
//			driver.findElement(By.id("name")).sendKeys(name);
//			//Step 2: indentify the email textFiled
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			driver.findElement(By.id("email")).clear();
//			driver.findElement(By.id("email")).sendKeys(email);
//			//Step 3: identify the password 
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			driver.findElement(By.name("password")).clear();
//			driver.findElement(By.name("password")).sendKeys(password);
//			
			System.out.println("Name : "+name);
			System.out.println("id : "+email);
			System.out.println("dept : "+password);
			Reporter.log("createUser_invalid for registerTest",true);
//		}
		}
		
        }
			

