package com.headless.mode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class HeaderChromeBrowser {
	

	public static void main(String[] args) {
        // WebDriverManager.chromedriver().setup();
         
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

         driver.get("https://mail.google.com");
         System.out.println("Title of the Webpage is " + driver.getTitle());
		
		
	}

}
