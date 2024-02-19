package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToSelectMultipleLInksinApplication {
	
	WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("selenium@abc.com");
  WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Sanskriti$*123");	
   WebElement login = driver.findElement(By.id("Login"));
        login.click();
        //Tagname usage....
  System.out.println(driver.findElement(By.tagName("a")).getSize());//driver.findElement(By.tagName("a")).getSize() ;// with the help of tagname locator will get all the links of the webPage.
     //     Dimension size = links.getSize();
          
      //    System.out.println(size);
                
              //  links.notify();

		
	}

}
