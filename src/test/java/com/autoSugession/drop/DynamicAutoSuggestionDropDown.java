package com.autoSugession.drop;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicAutoSuggestionDropDown {
       static WebDriver driver;
       static String letter ;
	public static void main(String[] args) throws Exception  {
		 driver = new ChromeDriver();
			driver.manage().window().maximize();

	 	driver.get("https://demoqa.com/auto-complete");
	 	selectText("M");
	 	
	}
	
	
	
	public static void selectText(String letter) {
	 	
	   WebElement text = 	driver.findElement(By.id("autoCompleteSingleInput"));
	   text.sendKeys(letter);
	   
	List<WebElement>  list    = driver.findElements(By.xpath("//div[@class='auto-complete__menu-list css-11unzgr']/div"));
		 System.out.println("The size of AutoSuggestion is  " +list.size());
		
		 for(WebElement listitems : list) {
			 if(listitems.getText().contains(letter)) {
				 listitems.click();
				 break;
			 }
		 }
		 
}
}
