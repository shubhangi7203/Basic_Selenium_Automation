package com.qa.testscripts;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.function.Function;

public class Waits_Demo extends TestBase 
{
	//Waits in Selenium
	//Wait : Wait it just a command that waits for a specific period of time before nosuchelemntexception.
	//There are 3 types :
	//1. Implicit Wait :Global wait for all elements, it applies to :All findElement() calls
	//2. Explicit Wait :Wait for a specific condition, it applies to :Specific element
	//3. Fluent Wait :Customized wait with polling, it applies to :Highly dynamic elements
	

	//@Test(priority =1)
	public void ImplicitWaitTest()
	{
		 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Applies globally
	        driver.get("https://automationexercise.com");

	        WebElement loginLink = driver.findElement(By.linkText("Signup / Login"));
	        loginLink.click();

	        WebElement emailField = driver.findElement(By.name("email"));
	        emailField.sendKeys("test@example.com");

	        //driver.quit();
	        
	}
	
	//@Test(priority =2)
	public void ExplicitWaitTest()
	{
		driver.get("https://automationexercise.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Signup / Login")));
        loginLink.click();

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        emailField.sendKeys("test@example.com");
        
	}
	
	@Test(priority =3)
	public void FluentWaitTest()
	{
		driver.get("https://automationexercise.com");

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(20))
            .pollingEvery(Duration.ofSeconds(2))
            .ignoring(NoSuchElementException.class);

        WebElement loginLink = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.linkText("Signup / Login"));
            }
        });

        loginLink.click();
	}

}
