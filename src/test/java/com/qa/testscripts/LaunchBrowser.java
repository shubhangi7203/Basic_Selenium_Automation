package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchBrowser 
{
	WebDriver driver;
	
	@BeforeMethod()
	public void Setup()
	{
		System.setProperty("webdriver. edge. driver","C:\\Users\\SS\\Downloads\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void LoginFun() throws InterruptedException
	{
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(2000);
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));
		UserName.sendKeys("tomsmith");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("SuperSecretPassword!");
		
		WebElement Submit = driver.findElement(By.xpath("//button[@class='radius']"));
		Submit.click();
		
		Thread.sleep(2000);
	}
	
	
	@AfterMethod()
	public void TearDown()
	{
		driver.close();
	}
}
