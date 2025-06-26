package com.qa.testscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Handling_Alerts_Demo extends TestBase
{
	//Handling alerts : alert is nothing but small message box of window.
	//There are 5 methods:
	//✅ 1. accept() – Click OK (used in all types of alerts)
	//✅ 2. dismiss() – Click Cancel (used in confirmation alerts)
	//✅ 3. getText() – Get the alert message text
	//✅ 4. sendKeys("text") – Enter text in prompt alert
	//✅ 5. pagesource()	
//____________________________________________________________________________________________
	
	@Test(priority =1)
	public void AcceptAlertTest() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Alerts.html");

        // Click the button to trigger a simple alert
        driver.findElement(By.xpath("//button[contains(text(),'alert box')]")).click();

        // Switch to alert and click OK
        Alert alert = driver.switchTo().alert();
        alert.accept();  // Click OK
        
        Thread.sleep(2000);
	}
	
	@Test(priority =2)
	public void DismissAlertTest() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Alerts.html");

        // Navigate to confirmation alert tab
        driver.findElement(By.xpath("//a[contains(text(),'OK & Cancel')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'confirm box')]")).click();

        // Switch to alert and click Cancel
        Alert alert = driver.switchTo().alert();
        alert.dismiss();  // Click Cancel
        Thread.sleep(2000);


	}
	
	@Test(priority =3)
	public void GetTextAlertText() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Alerts.html");

        // Trigger alert
        driver.findElement(By.xpath("//button[contains(text(),'alert box')]")).click();

        // Switch to alert
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();  // Get alert text
        System.out.println("Alert says: " + alertMessage);

        alert.accept();  // Close it
        Thread.sleep(2000);

	}
	
	@Test(priority =4)
	public void SendKeysAlertText() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Alerts.html");

        // Navigate to Prompt Alert tab
        driver.findElement(By.xpath("//a[contains(text(),'Textbox')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'prompt box')]")).click();

        // Switch to alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Automation Tester");  // Enter text
        alert.accept();  // Submit
        
        Thread.sleep(2000);
	}

}
