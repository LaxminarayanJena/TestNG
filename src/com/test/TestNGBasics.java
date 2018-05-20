package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	
	/*
	 * set up system for chrome
	launching chrome broswer
	login
	enter url
	google title test
	logout from app
	close browser
	delete all cookies
	generate report
	*/
	
	//pre conditions- starting with @Before
	@BeforeSuite //1
	public void setUP()
	{
		System.out.println("set up system for chrome");
	}
	@BeforeClass //3
	public void login()
	{
		System.out.println("login");
	}
	
	@BeforeMethod //4
	public void enterURL()
	{
		System.out.println("enter url");
	}
	
	@BeforeTest //2
	public void launchBrowser()
	{
		
		System.out.println("launching chrome broswer");
	}
	
	//test cases- starting with @test
	@Test //5
	public void googleTitleTest()
	{
		System.out.println("google title test");
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("search test");
	}
	
	@Test
	public void googlelogoTest()
	{
		System.out.println("google logo test");
	}
	
	
	//post conditions- starting with @After
	@AfterMethod //6
	public void logout()
	{
		System.out.println("logout from app");
	}
	
	@AfterTest //8
	public void deleteAllCookies()
	{
		System.out.println("delete all cookies");
	}
	
	@AfterClass //7
	public void closeBrowser()
	{
		System.out.println("close browser");
	}
	
	@AfterSuite //9
	public void  generateTestReport()
	{
		System.out.println("generate report");
	}

}
