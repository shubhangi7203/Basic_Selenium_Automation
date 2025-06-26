package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebPage_Scrolling_Demo extends TestBase
{
	//Handling Scrolling Methods:
	//In WebPage scolling we have using JavascriptExecutor for window scrolling
	//There are 4 ways to handle webpage scrolling:
	// 1. Scroll By Pixel
	// 2. Scroll to a WebElement
	// 3. Scroll to Bottom of Page
	// 4. Scroll to Top of Page
	// 5. Scroll using Actions Class
	// 6. Scroll by horizontally
	
	//🔹 1. Scroll By Pixel
	@Test(priority=1)
	public void ScrollDownUsingPixel() throws InterruptedException
	{
		driver.get("https://automationexercise.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)");
		
		Thread.sleep(2000);
	}
	
	//🔹 2. Scroll to a WebElement
	@Test(priority =2)
	public void ScrollDownUsingWebElemnt() throws InterruptedException
	{
		//driver.get("https://automationexercise.com");
		WebElement subscription = driver.findElement(By.xpath("//h2[text()='Subscription']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subscription);
		Thread.sleep(2000);
	}
	
	//🔹 3. Scroll to Bottom of Page
	@Test(priority =3)
	public void ScrollDownUsingBottomPage() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
	}
	
	//🔹 4. Scroll to Top of Page
	@Test(priority = 4)
	public void ScrollToTop() throws InterruptedException
	{
		// Scroll down first
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		// Scroll back up
		js.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(2000);
	}
	
	//🔹 5. Scroll using Actions Class
	@Test(priority = 5)
	public void ScrollUsingActions() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();  // Scrolls down one screen
		Thread.sleep(2000);
	}
	
	
	
	

}
