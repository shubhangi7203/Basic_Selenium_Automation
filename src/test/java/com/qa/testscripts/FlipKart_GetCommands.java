package com.qa.testscripts;

import org.testng.annotations.Test;

public class FlipKart_GetCommands extends TestBase
{
	@Test
	public void LaunchBrowser() throws InterruptedException
	{
		driver.get("https://www.zeptonow.com/");
		//get command is used to automatically open new browser window and featch the page.
		
		boolean contains = driver.getCurrentUrl().contains("https://www.zeptonow.com/");
		//The getcurrenturl method  is used to featching current URL of the page.
		if(contains)
			{
				System.out.println("User is landed on Homepage");
			}
		else
			{
				System.out.println("User is not landed on homepage");
			}
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		//The gettitle method is used to featch the title of current page.
		
//		String PageSource = driver.getPageSource();
		
		//It returns source code of the page as a string value
		System.out.println(driver.getPageSource());
		Thread.sleep(2000);
		
		;
	}
	
	

}
