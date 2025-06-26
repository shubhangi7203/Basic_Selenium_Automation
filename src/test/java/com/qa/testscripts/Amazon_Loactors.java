package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Amazon_Loactors extends TestBase
{
	//In this class I have used FindElement, FindElements, and mutiple locators 
	//FindElement: it is used to featch the Webelement withing the page
	//FindElements it is used ti featch the list of webelements wthin the page.
	//Locators : id, className, TagName, name, linkedText, ParitalLinkText, xpath, cssSelector
	@Test
	public void LaunchBrowser() throws InterruptedException
	{
		driver.get("https://www.flipkart.com/");
		boolean contains = driver.getTitle().contains("flipkart");
		if(contains)
		{
			System.out.println("Landed on the page");   // launch URL on the driver instance
		}
		else
		{
			System.out.println("User is not landed on hompage");
		}
		
		Thread.sleep(2000); // Waits for 2 seconds
		
		
		
		WebElement SearchTextFiled = driver.findElement(By.name("q")); //Using name locator
		SearchTextFiled.sendKeys("iphone15 pro max");
		Thread.sleep(2000);// Waits for 2 seconds
		
		List<WebElement> SearchList = driver.findElements(By.className("_3D0G9a"));  //findelements is used to featch list of webelements
		int count = SearchList.size();   //to check the list of webelement Size
        System.out.println("Total number of Items : " +count);
        for(WebElement item:SearchList)
        {
        	System.out.println(item.getText());  
        }
		
		
		WebElement SearchButton = driver.findElement(By.className("_2iLD__")); //Using className Locator
		SearchButton.click();
		Thread.sleep(2000); //// Waits for 2 seconds
		
		
		//Select particular mobile
		WebElement SelectMobile = driver.findElement(By.xpath("//*[text()='Apple iPhone 15 Pro Max (White Titanium, 256 GB)']"));
		SelectMobile.click();
		Thread.sleep(2000); // Waits for 2 seconds
				
	}

}
