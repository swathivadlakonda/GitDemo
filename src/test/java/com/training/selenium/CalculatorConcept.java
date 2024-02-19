package com.training.selenium;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculatorConcept {
static WebDriver driver;
	public static void main(String[] args) {
		login();
        calculator();
	}
	
	
	public static void login() {
		WebDriverManager.chromedriver().setup();
		     driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com");
		driver.manage().window().maximize();	
			
		WebElement email = driver.findElement(By.id("email_field"));   
		             email.sendKeys("admin123@gmail.com");
		             
		WebElement password = driver.findElement(By.cssSelector("#password_field"));    
		             password.sendKeys("admin123");                                      
		             
		WebElement login = driver.findElement(By.xpath("//button[text() ='Login to Account']"));  
		             login.click();
		             
		
	}
	
	public static void calculator() {
		WebElement cal = driver.findElement(By.xpath("//a[text()='Calculator']"));
		explicitwait(20,cal);
		cal.click();
		
		WebElement four = driver.findElement(By.xpath("//input[@value='4']"));
		four.click();
		WebElement plus = driver.findElement(By.xpath("//input[@value='+']"));
		plus.click();
		WebElement nine = driver.findElement(By.xpath("//input[@value='9']"));
		nine.click();
		WebElement equalsto = driver.findElement(By.xpath("//input[@value='=']"));
		equalsto.click();
		  WebElement display = driver.findElement(By.id("display"));
		  // String answer = display.getAttribute("value");
		 //  System.out.println("The answer of 4+9 = " +answer);
	//	  Validation using assert------//
		  String Ecpectedvalue = "20";
		  String Actualvalue = display.getAttribute("value");
		Assert.assertEquals(Actualvalue, Ecpectedvalue);
		   
	}
	
		
	public static void explicitwait (int time, WebElement element) {
		WebDriverWait wait =new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	

}
