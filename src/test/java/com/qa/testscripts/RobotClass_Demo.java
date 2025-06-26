package com.qa.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RobotClass_Demo extends TestBase
{

	@Test
	public void RobotClassDemo() throws InterruptedException, AWTException
	{
		// Navigate to file upload demo page
        driver.get("https://demo.guru99.com/test/upload/");
        Thread.sleep(2000);
        
        System.out.println("User is landed on homepage");
        
        WebElement Upload = driver.findElement(By.id("uploadfile_0"));
        Upload.sendKeys("C:\\Users\\SS\\Desktop\\New Folder\\sample.txt");
        Thread.sleep(2000);
        
        WebElement termsCheckbox = driver.findElement(By.id("terms"));
        termsCheckbox.click();

        WebElement submitButton = driver.findElement(By.id("submitbutton"));
        submitButton.click();

	}

}
