package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay4 {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		login();
		Thread.sleep(5000);
		switchtToTab();
		clickonAlert();
		cliclonwindowalert();
		Thread.sleep(5000);
		switchtToTab1();
		clickonWindows();
		
//Implicit wait command
 		
	}	
	
	


	public static void login() {
		WebDriverManager.chromedriver().setup();
		     driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com");
		driver.manage().window().maximize();	
		
	
		//	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);   // driver will check max amount of time for each elemenent to wait, then it will throw an Exception, if its not found.
		
		WebElement email = driver.findElement(By.id("email_field"));   
		             email.sendKeys("admin123@gmail.com");
		             
		             
		WebElement password = driver.findElement(By.cssSelector("#password_field"));    
		             password.sendKeys("admin123");                                      
		             
		WebElement login = driver.findElement(By.xpath("//button[text() ='Login to Account']"));  
		             login.click();
		             
		
	}
	//MouseOver concept... for this we need to use 'Actions' class	
	private static void switchtToTab() {
		WebElement switchMouseOver = driver.findElement(By.xpath("//button[contains(text(), 'Switch To')]"));
		       Actions action = new Actions(driver);
		       action.moveToElement(switchMouseOver).build().perform();
		
	}
	
	private static void clickonAlert() {
		WebElement alertbutton = driver.findElement(By.xpath("//a[@href='./alert.html']"));
		           alertbutton.click();
		
	}
	
	private static void cliclonwindowalert() {
		WebElement windowalert = driver.findElement(By.xpath("//button[contains(text(),'Window Alert')]"));
		          windowalert.click();
          String alerttext =   driver.switchTo().alert().getText();   // getText() will return whatever text in the popup box. 
		    	  System.out.println(alerttext);
		    driver.switchTo().alert().accept();    
		
	WebElement promtalert = driver.findElement(By.xpath("//button[text()='Promt Alert']"));
	             promtalert.click();
	             driver.switchTo().alert().sendKeys("Swathi");  //popup box message will be displayed by using the sendkeys method.
	             driver.switchTo().alert().accept();
	           //  driver.switchTo().alert().dismiss();
	         String alertinfo = driver.findElement(By.id("Selenium")).getText();
	            System.out.println(alertinfo);
	

	}
        
	private static void switchtToTab1() {
		WebElement switchMouseOver = driver.findElement(By.xpath("//button[contains(text(), 'Switch To')]"));
		       Actions action = new Actions(driver);
		       action.moveToElement(switchMouseOver).build().perform();
		
	}
	private static void clickonWindows() {
		
		WebElement window = driver.findElement(By.xpath("//a[text()='Windows']"));
		           window.click();
		WebElement Newtab = driver.findElement(By.xpath("//button[contains(text(),' Tab')]"));
		          Newtab.click();
		     
	  WebElement NewWindow = driver.findElement(By.xpath("//button[contains(text(),' Window')]"));
		          NewWindow.click();          
		
	}

	

}
