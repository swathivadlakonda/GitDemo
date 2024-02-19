package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedIsSelecedIsEnabed {

	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        WebElement isd = driver.findElement(By.id("small-searchterms"));
        
        System.out.println(isd.isDisplayed());
        System.out.println(isd.isEnabled());
        
        
       WebElement male =   driver.findElement(By.id("gender-male"));
       male.click();
      System.out.println(male.isSelected());
	}

}
