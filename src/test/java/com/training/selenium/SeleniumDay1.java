package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay1 {
	static WebDriver driver;
	
public static void main(String[ ] args) throws InterruptedException {
	
	//WebDriverManager.chromedriver().setup();
	WebDriverManager.firefoxdriver().setup();
//	driver = new ChromeDriver();
	driver = new FirefoxDriver();
	//ChromeDriver driver = new ChromeDriver();
	//WebDriver driver = new ChromeDriver();
	driver.get("https://selenium-prd.firebaseapp.com/home.html");
	driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
	driver.findElement(By.id("password_field")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[text()='Login to Account']")).click();
	Thread.sleep(5000);
   driver.findElement(By.id("name")).sendKeys("Sanskriti");
  // driver.findElement(By.xpath("//button [contains(text() 'widget')]"));
   
   
   
  
   
}
} 