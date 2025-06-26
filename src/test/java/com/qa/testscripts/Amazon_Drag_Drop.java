package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon_Drag_Drop extends TestBase
{
	//Handling Drop down 
	//There are 3 methods:
	// 1. selectbyvisibleText
	// 2. selectbyIndex
	// 3. selectByIndex
	
	@Test
	public void LunchBrowser() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//create the object of the select class
		Select se = new Select(driver.findElement(By.id("searchDropdownBox")));
		
		//select the option using visible index
		//se.selectByIndex(3);
		
		//select the option using visible text
		//se.selectByVisibleText("Books");
		
		//select the option using visible value
		se.selectByValue("search-alias=stripbooks");
		
		Thread.sleep(2000);
		
		
	}

}
