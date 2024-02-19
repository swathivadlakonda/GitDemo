package com.headless.mode;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TAkeScreenShortInHeadless {

	public static void main(String[] args) throws IOException {
		
		 ChromeOptions options = new ChromeOptions();
	       options.addArguments("--headless");
	       WebDriver  driver = new ChromeDriver(options);
			driver.get("https://www.programiz.com/sql/online-compiler/");
	       driver.manage().window().maximize();
			WebElement clearEditor = driver.findElement(By.xpath("//div[@class=\"CodeMirror-lines\"]"));
			Actions action = new Actions(driver);
			   action.click(clearEditor).keyDown(Keys.CONTROL)
			    .sendKeys("a")
			    .keyUp(Keys.CONTROL)
			    .sendKeys(Keys.BACK_SPACE)
			    .build()
			    .perform();
			   action.sendKeys("SELECT * FROM Customers;").build().perform();
				 WebElement RunSql = driver.findElement(By.xpath("//button[@class=\"cta-btn\"]"));
				  RunSql.click();
				  System.out.println("SQl Query result is Displayed");
				  
				  //Taking Screen short code
				  
				  TakesScreenshot ts = (TakesScreenshot)driver;
				  File source = ts.getScreenshotAs(OutputType.FILE);
				  String dest = "C:\\Users\\swath\\eclipse-workspace\\SeleniumConcept\\Screenshorts\\HeadlessScreenshort.png";
				  File destination = new File(dest);
				  FileUtils.copyFile(source, destination);
				  System.out.println("ScreenShort Captured ......");
			driver.close();
			

	}

}
