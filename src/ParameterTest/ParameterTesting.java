package ParameterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTesting {
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","username"})
	public void yahooLoginTest(String url,String username)
	{
		driver = new ChromeDriver();
		driver.get(url);
		
	   driver.findElement(By.xpath(".//*[@id='login-username']")).sendKeys(username);
	   driver.findElement(By.xpath(".//*[@id='login-signin']")).click();
	}

}
