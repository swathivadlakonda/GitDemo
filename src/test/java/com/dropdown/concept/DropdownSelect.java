package com.dropdown.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSelect {
              static WebDriver driver;
	public static void main(String[] args) {
            //   WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
               driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
             WebElement dropdown =  driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
               Select drop = new Select(dropdown);
            String values =    dropdown.getText();
            System.out.println("The drop Down List is " +values);
            System.out.println("==============================");
                   drop.selectByValue("AED"); // select by value
                   System.out.println(drop.getFirstSelectedOption().getText());  // for getting the value of the drop down list.
                   drop.selectByIndex(1); // select by Index
                   System.out.println(drop.getFirstSelectedOption().getText());
                   drop.selectByVisibleText("USD");
                   System.out.println(drop.getFirstSelectedOption().getText());
                                    
	}
}
