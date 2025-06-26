package com.qa.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Zepto_Navigate_Commands extends TestBase
{
	@Test
	public void LaunchBrowser() throws InterruptedException, AWTException
	{
		driver.navigate().to("https://www.zeptonow.com/");
		
		Thread.sleep(2000);
		
		WebElement Search = driver.findElement(By.xpath("//*[text()='Search for']"));
		Search.click();
		
		Thread.sleep(2000);
		
		WebElement SearchTextField = driver.findElement(By.xpath("//input[@placeholder='Search for over 5000 products']"));
		SearchTextField.sendKeys("Kurkure");
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}

}
