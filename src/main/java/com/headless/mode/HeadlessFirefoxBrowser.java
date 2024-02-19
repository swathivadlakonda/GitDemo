package com.headless.mode;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;



public class HeadlessFirefoxBrowser {

	static WebDriver driver;

	public static void main(String[] args) {
        // WebDriverManager.firefoxdriver().setup();
         FirefoxOptions options = new FirefoxOptions();
         options.setHeadless(true);
         driver = new FirefoxDriver(options);
         
        

         driver.get("https://selenium-prd.firebaseapp.com/home.html");
         System.out.println("Title of the Webpage is " + driver.getTitle());
		
		
	}

}
