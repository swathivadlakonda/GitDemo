package com.training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateWindowsForwordAndBackword {
        static WebDriver driver;
	public static void main(String[] args) {
	//WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/");
	driver.navigate().to("https://www.google.com/");
	driver.navigate().back();
	driver.navigate().forward();

	}

}
