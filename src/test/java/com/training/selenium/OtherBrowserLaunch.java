package com.training.selenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OtherBrowserLaunch {
    static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();	
		FirefoxDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver1.get("https://selenium-prd.firebaseapp.com/home.html");
	}

}
