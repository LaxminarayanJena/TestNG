package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutAndException {
	
	@Test(timeOut=2000 )
	public void test()
	{
		
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}
	
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1()
	{
		String x="10a";
		Integer.parseInt(x);
		
	}

}
