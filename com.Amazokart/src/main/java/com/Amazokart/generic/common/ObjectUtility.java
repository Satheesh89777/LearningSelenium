 package com.Amazokart.generic.common;

import com.Amazokart.generic.ExcelUtility.ReadExcelFile;
import com.Amazokart.generic.WebDriverUtility.WebDriverUtility;
import com.Amazokart.generic.javautility.JavaUtility;
import com.Amazokart.generic.propertyfileUtility.ReadPropertiFile;

public class ObjectUtility implements FrameworkConstant {
	public ReadExcelFile excelObj;
	public JavaUtility javaObj;
	public ReadPropertiFile propertyobj;
	public WebDriverUtility webdriverObj;
	
public void objectCreation() 

{
	excelObj=new ReadExcelFile();
	javaObj=new JavaUtility();
    propertyobj=new ReadPropertiFile();
	webdriverObj=new WebDriverUtility();
}
}
