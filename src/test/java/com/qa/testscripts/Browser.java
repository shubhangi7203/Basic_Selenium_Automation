package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser extends TestBase
{
	public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver (e.g., ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Navigate to the login page
        driver.get("https://the-internet.herokuapp.com/login");
        Thread.sleep(2000);

        // Enter username
        WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));
        UserName.sendKeys("tomsmith");

        // Enter password
        WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
        Password.sendKeys("SuperSecretPassword!");

        // Click the login button
        WebElement Submit = driver.findElement(By.xpath("//button[@class='radius']"));
        Submit.click();

        Thread.sleep(2000);

        // Close the browser
        driver.quit();
	}
	
}
