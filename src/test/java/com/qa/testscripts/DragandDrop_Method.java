package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop_Method extends TestBase
{
	//Drag and drop method:
	//In drag and drop method We are using action class
	//Action class provide keyword and mouse event
	
	@Test
	public void LaunchBrowser() throws InterruptedException
	{
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		
		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window. scrollBy(0, 400)");
		
		Actions action = new Actions(driver);
		action.dragAndDrop(From, To).build().perform();
		
		Thread.sleep(8000);
		
		
	}
	

}
