package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass_Demo extends TestBase
{
	@Test
	public void LaunchBrowser() throws InterruptedException
	{
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		
		        // Create Actions object
		        Actions actions = new Actions(driver);

		        // 1. moveToElement (Hover)
		        WebElement hoverElement = driver.findElement(By.id("rightClickBtn"));
		        actions.moveToElement(hoverElement).perform();

		        // 2. contextClick (Right click)
		        actions.contextClick(hoverElement).perform();

		        // 3. doubleClick
		        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
		        actions.doubleClick(doubleClickBtn).perform();

		        // 4. click
		        WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
		        actions.click(clickBtn).perform();

		        // Navigate to another page for drag-and-drop demo
		        driver.get("https://demoqa.com/droppable");

		        // 5. dragAndDrop
		        WebElement source = driver.findElement(By.id("draggable"));
		        WebElement target = driver.findElement(By.id("droppable"));
		        actions.dragAndDrop(source, target).perform();

		        // 6. clickAndHold + moveToElement + release
		        driver.navigate().refresh(); // reset positions
		        source = driver.findElement(By.id("draggable"));
		        target = driver.findElement(By.id("droppable"));
		        actions.clickAndHold(source).moveToElement(target).release().perform();

		        // 7. sendKeys (keyboard)
		        driver.get("https://www.google.com");
		        WebElement searchBox = driver.findElement(By.name("q"));
		        actions.click(searchBox).sendKeys("Selenium WebDriver").sendKeys(Keys.ENTER).perform();

		      
		    }

		
	}

