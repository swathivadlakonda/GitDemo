package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleClickTooltip {
         static WebDriver driver;
         public static void main(String[] args) throws InterruptedException {
        	 login();
        	 Thread.sleep(5000);
     		interaction();
     		doubleclick();
         }
			
		
		
		
	
	
	
	
	
	public static void login() {
		WebDriverManager.chromedriver().setup();
		   WebDriver  driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com");
		driver.manage().window().maximize();	
		
		
		WebElement email = driver.findElement(By.id("email_field"));   
		             email.sendKeys("admin123@gmail.com");
		             
		WebElement password = driver.findElement(By.cssSelector("#password_field"));    
		             password.sendKeys("admin123");                                      
		             
		WebElement login = driver.findElement(By.xpath("//button[text() ='Login to Account']"));  
		             login.click();
		             
		
	}
	public static void interaction() {
		
		WebElement interactions = driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		//explicitwait(10,interactions);
		//interactions.click();
                 Actions action = new Actions(driver);
                 action.moveToElement(interactions).build().perform();
	}
	public static void doubleclick() {
		WebElement doubleclick =  driver.findElement(By.xpath("//a[contains(text(),'Double Click')]"));
		            doubleclick.click();

		
	}
	
		
	
	public static void explicitwait (int time, WebElement element) {
		WebDriverWait wait =new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));

}
}
;
