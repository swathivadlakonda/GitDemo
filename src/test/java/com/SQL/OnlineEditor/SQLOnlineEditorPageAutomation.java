package com.SQL.OnlineEditor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SQLOnlineEditorPageAutomation {
	
	
	static WebDriver driver;
	 
	public static void main(String[] args) {
	
	     driver = new ChromeDriver();
	 	Actions action = new Actions(driver);
		driver.get("https://www.programiz.com/sql/online-compiler/");
		driver.manage().window().maximize();
		WebElement clearEditor = driver.findElement(By.xpath("//div[@class=\"CodeMirror-lines\"]"));
		
		clearEditor( driver,clearEditor);
		 action.sendKeys("SELECT * FROM Customers;").build().perform();
		 WebElement RunSql = driver.findElement(By.xpath("//button[@class=\"cta-btn\"]"));
		  RunSql.click();
		  
		   clearEditor( driver,clearEditor);
		   action.sendKeys("select first_name || ',' || last_name as FullName from Customers;").build().perform();
		   RunSql.click();
		
	}
	
	public static void clearEditor(WebDriver driver,WebElement clearEditor) {
		Actions action = new Actions(driver);
		   action.click(clearEditor).keyDown(Keys.CONTROL)
		    .sendKeys("a")
		    .keyUp(Keys.CONTROL)
		    .sendKeys(Keys.BACK_SPACE)
		    .build()
		    .perform();
		
	}

}
