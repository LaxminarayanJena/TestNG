package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAssertionTestCases {
	
	
	
	@Test
	public void test1()
	{
		SoftAssert softAssert1 = new SoftAssert();
		System.out.println("open browser");
		Assert.assertEquals(true, true);    //hard assertion  ..immediately testcase will be marked as failed and rest steps will not execute
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on signin button");
		
		Assert.assertEquals(true, true);  
		System.out.println("validate homepage");
		
		softAssert1.assertEquals(true, false ,"home page title is missing"); //soft assertion-- rest steps will execute		
		
		System.out.println("go to deals page");
		System.out.println("create a deal");
		
		softAssert1.assertEquals(true, false ,"not able to create a deal"); 
		
		System.out.println("go to  contacts page");
		System.out.println("create contact");
		
	
		
		softAssert1.assertAll(); //will show test case fail in red colour otherwise it will show pass in gree colour
	}
	
	@Test
	public void test2()
	{
		SoftAssert softAssert2 = new SoftAssert();
		System.out.println("log out");
		softAssert2.assertEquals(true, false ,"not able to logout"); 
		softAssert2.assertAll();
	}
	
	

}
