package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WellsFairErrorLoginMessage {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
		driver.get("https://www.wellsfargo.com/");
		driver.manage().window().maximize();
		System.out.println("lauch application");
	//	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
		driver.findElement(By.id("userid")).sendKeys("djksd");
	//	Thread.sleep(3000);
		
		
		WebElement password = driver.findElement(By.id("password_label"));
		password.sendKeys("heaka");
		  
		WebElement submit = driver.findElement(By.name("btnSignon"));
		submit.click();
		
		WebElement validate = driver.findElement(By.xpath("//div/p[contains(text(),'records')]"));
		String str = validate.getText();
		System.out.println(str);
		
		//div/p[contains(text(),'records')]	

	}

}

