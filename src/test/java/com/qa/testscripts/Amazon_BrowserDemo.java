package com.qa.testscripts;

import org.testng.annotations.Test;

public class Amazon_BrowserDemo extends TestBase
{
	@Test
	public void LaunchBrowser() throws InterruptedException
	{
		
		driver.get("http://www.amazon.in/");   // launch URL on the driver instance
		boolean contains = driver.getTitle().contains("Amazon");
		if(contains)
		{
			System.out.println("Landed on the page");   // launch URL on the driver instance
		}
		else
		{
			System.out.println("User is not landed on hompage");
		}
		
		Thread.sleep(2000);
		
	}

}
