package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay2 {
	static WebDriver driver;
	public static void main(String[] args) {
		
	//WebDriverManager.chromedriver().setup();  // lunching the browser
	 ChromeDriver driver = new ChromeDriver(); // these two lines indicate for launching the browser
	 driver.get("https://www.selenium.dev/");  // this indicate enter the WebSite
	 driver.manage().window().maximize();   // this indicates maximize the screen like it show the fullScreen of webSite
	 
     String txtwebdriver = driver.findElement(By.xpath("//h4[@class='h3 mb-3 selenium-webdriver']")).getText();
     System.out.print(txtwebdriver);
     driver.findElement(By.linkText("About Selenium")).click(); //for using linkText, it will go to this link and open that link by clicking it. 	
	}
	

}