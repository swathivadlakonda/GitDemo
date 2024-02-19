package com.dropdown.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownItemClick3Times {
            static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
         driver.findElement(By.id("divpaxinfo")).click();
         Thread.sleep(3000);
         System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//         for(int i=1;i<5;i++) // using for loop
//         {
//         driver.findElement(By.id("hrefIncAdt")).click();      // this button will click 4 times continuously
//        		 
//         }
         int i = 1;
         while(i<5) // using while loop
         {
        	 driver.findElement(By.id("hrefIncAdt")).click();
        	 i++;
         }
                		 
        		 
         driver.findElement(By.id("btnclosepaxoption")).click();
         System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
