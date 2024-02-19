package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforeceExa {
     WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(5000);	
	    WebElement iframe = driver.findElement(By.id("marketing"));
	    driver.switchTo().frame(iframe);
	   Thread.sleep(5000);
	 //   WebElement Learn = driver.findElement(By.xpath("(//span[contains(text(),' Learn more')])[2]")); // this is for LearMore button
		   WebElement Learn = driver.findElement(By.xpath("//span[contains(text(),'Start my free trial')]")); //this is for Start my free trial
	    // WebDriverWait wait = new WebDriverWait(driver, 20);
	//	 wait.until(ExpectedConditions.visibilityOf(Learn));
	    // Learn.click();
	     String trial = Learn.getText();
	     System.out.println(trial);
	     
	     //Switch back from frame....
	     driver.switchTo().defaultContent();
	     WebElement login = driver.findElement(By.id("rememberUn"));
	     login.click();
	}

}
	