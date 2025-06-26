package com.qa.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Google_Travel extends TestBase
{
	@Test(priority =1)
	public void Browser_Launch_URL_Open() throws InterruptedException, AWTException
	{
		driver.get("https://www.google.com/travel/");
		boolean contains = driver.getCurrentUrl().contains("https://www.google.com/travel/");
		if(contains)
		{
			System.out.println("User is landed on GoogleTravel Homepage");
			//Assert.assertTrue(contains);
		}
		else
		{
			System.out.println("User is Not landed on GoogleTravel Homepage");
			//Assert.assertTrue(contains);
		}
		
		Thread.sleep(2000);		
		
		WebElement Search = driver.findElement(By.xpath("(//input[@placeholder='Search for flights, hotels and more'])[1]"));
		Search.sendKeys("Mumbai");

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(4000);
	}
	

}
