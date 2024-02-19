package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
	/*	WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	driver.get("https://courses.letskodeit.com/practice");
	driver.manage().window().maximize();	
	

	//	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);   // driver will check max amount of time for each elemenent to wait, then it will throw an Exception, if its not found.
	
	                                  
	             
		WebElement checkbox = driver.findElement(By.id("bmwcheck"));  
	    driver.get( driver.getCurrentUrl());  // when you reload the page again when you found the element then it will throw an stale element reference exception
	             checkbox.click();
	   // for solving this exception we need to find the elements whenever you want, that time you can write dont write and keep it, when some changes or reload happends in the webpage this exception will may accure.  */  
	
	             
	     /*  Other way of doing Stale Element Exception..........*/
		
		
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.pavantestingtools.com");
	   driver.manage().window().maximize();
	   WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Online Training')]"));
	   link.click();
	   driver.navigate().back();   //when you perform option on web page and you go back to that page and perform the same action that time stale element exception will through, because when you go back to the page all element are get to refresh so driver cannot find the element.
	// link.click();
	   
	   // stale element will through here, how to solve this issue.. 
	   //we can solve this issue by using the try catch method, we need to perform action in try block and in catch we need to provide the what type of exception your  getting and in the block you have to provide same like find the web elemnt and same action we need to perform 
	             
	       try {
	    	   link.click();

	       }
	       catch(StaleElementReferenceException e) {
	    	   link = driver.findElement(By.xpath("//a[contains(text(),'Online Training')]"));
	    	   link.click();
	    	   
	       }
	       
	       
	       //other way....
	       driver.get("https://selenium-prd.firebaseapp.com/home.html");
	  WebElement Username =  	driver.findElement(By.id("email_field"));
	       Username.sendKeys("admin123@gmail.com");
	   	driver.findElement(By.id("password_field")).sendKeys("admin123");
	   	
                 driver.navigate().refresh();     
                 
      	       Username.sendKeys("admin123@gmail.com");

	             
	             
	             
	             
	             
	             
	             
	}
	


}
