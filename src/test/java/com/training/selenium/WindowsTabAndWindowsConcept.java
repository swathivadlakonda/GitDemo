package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsTabAndWindowsConcept {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		login();
        switchtToTab(); 
        clickonWindowsTab();
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
	private static void switchtToTab() throws InterruptedException {
		Thread.sleep(5000);
		WebElement switchMouseOver = driver.findElement(By.xpath("//button[contains(text(), 'Switch To')]"));
		       Actions action = new Actions(driver);
		       action.moveToElement(switchMouseOver).build().perform();
		
	}
     private static void clickonWindowsTab() throws InterruptedException {
		
		WebElement window = driver.findElement(By.xpath("//a[text()='Windows']"));
		           window.click();
		WebElement windowTab = driver.findElement(By.xpath("//button[contains(text(),' Tab')]"));
		windowTab.click();
		
		//--------Parent or current Window Handle concept--------
		String parentWindow = driver.getWindowHandle(); // it will indicate the current/working window
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		
		  // System.out.println(parentWindow);
		   // System.out.println(driver.getWindowHandles());// will get two windows
	
	//----------------parent to child window handles using windowhandlers-----------	
		   for(String handle: driver.getWindowHandles()) {   //it will handles two windows, for loop first will go to the parentwindow and second loop it will stay in the child window and it will stay there handle or control
			   driver.switchTo().window(handle);
		   }
		   String title = driver.getTitle();
		   System.out.println(title);
		   driver.findElement(By.name("q")).sendKeys("Selenium");
		   
		   
		   
		   // Switch back to parent window.........//
		   driver.switchTo().window(parentWindow);
		   
		   String titleparent = driver.getTitle();  // for confirmation, are we shifted to parent window or not by testing the title of that window
		   System.out.println(titleparent);

		   ///Click on the second button called windowwindowButton
        
 		   Thread.sleep(5000);        
 		WebElement windowWin = driver.findElement(By.xpath("//button[contains(text(),'Window')]"));
 		 		windowWin.click();
 		 		
 		 		String parentWindowWin = driver.getWindowHandle(); // it will indicate the current/working window
 				String parentTitleWin = driver.getTitle();
 				System.out.println(parentTitleWin);
 				
 				for(String handle: driver.getWindowHandles()) {   //it will handles two windows, for loop first will go to the parentWindow and second loop it will stay in the child window and it will stay there handle or control
 				   driver.switchTo().window(handle);
 			   }
 			   String title1 = driver.getTitle();
 			   System.out.println(title1);
 			   driver.findElement(By.name("q")).sendKeys("salesforce");
 			   
 			   driver.switchTo().window(parentWindowWin);
  			   String titleparent1 = driver.getTitle();  // for confirmation, are we shifted to parent window or not by testing the title of that window
 			   System.out.println(titleparent1);
 		           
     }
}
