package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HanleColorOfTheWebelement {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://blazedemo.com");
	WebElement element = driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]"));
	String background = element.getCssValue("background-color");
	
	System.out.println(background);
	
       String elecolor = Color.fromString(background).asHex();
       System.out.println(elecolor);
       
       if(elecolor.equals("#006dcc")) {
    	   System.out.println("Test Pass");
    	   
       }
       else
    	   System.out.println("Test Fail");
       
       
	}

}
