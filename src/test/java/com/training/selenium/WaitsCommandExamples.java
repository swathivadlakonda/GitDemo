package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
// 3-Types of Waits in Selenium
   //   implicit wait {driver will check for each element for maximum time, and if not found it will throw an exception.}
   //  Explicit wait[ Only for specific elements it will check weather it present it will wait certain time, if its not present it will wait some time and if its not find that element it will throw an exception] 
   //  Fluent wait
  
public class WaitsCommandExamples {
  static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		 driver.get("https://selenium-prd.firebaseapp.com");
		 
		 //*-----IMPLICIT Wait ------------*//
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);	 
		
		 
		 WebElement email = driver.findElement(By.id("email_field"));   
         email.sendKeys("admin123@gmail.com");
         
WebElement password = driver.findElement(By.cssSelector("#password_field"));    
         password.sendKeys("admin123");                                      
         
WebElement login = driver.findElement(By.xpath("//button[text() ='Login to Account']")); 
         login.click();
        
         WebElement switchMouseOver = driver.findElement(By.xpath("//button[contains(text(), 'Switch To')]"));
        //explicitwait(20,switchMouseOver);
          fluentWait(switchMouseOver);
           switchMouseOver.click();
	     // Actions action = new Actions(driver);
	    //  action.moveToElement(switchMouseOver).build().perform();
	
		 
	}
	public static void explicitwait (int time, WebElement element) {
		WebDriverWait wait =new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	//*------------Fluent wait -----------*//
	public static void fluentWait(WebElement element) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(10, TimeUnit.SECONDS);
		wait.pollingEvery(200,TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
