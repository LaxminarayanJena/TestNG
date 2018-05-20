package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.junit.Assert;

public class GoogleTitleTest {
	
	WebDriver driver;
		
	@BeforeMethod
	public void setUp()
	{	
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
		
	
	@Test()
	public void googleTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google" ,"title is not matched");
		
		// use org.junit.Assert instead of junit.framework.Assert 
	
	}
	

	@Test()
	public void googleLogoTest()
	{
		boolean b=driver.findElement(By.xpath(".//*[@id='hplogo1']")).isDisplayed();
		Assert.assertTrue(b);
		//Assert.assertEquals(b, true);
		
		
	
	}
	
	
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.quit();
	}

}
