package com.DynamicWebtablelinktobe.Click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableLinkToBeClick {
	
	static WebDriver driver;
	
	
	
	public static void main(String[] args) {
		String str = "Burj Khalifa";
		String link = "details";
    driver = new ChromeDriver();
    driver.get("C:/Users/swath/OneDrive/Desktop/table.html");
    driver.manage().window().maximize();
    
    ClickOnRowData(str,link);
    System.out.println("Detaile link has opened");
    
	}
	public static void ClickOnRowData(String name,String linkText) {
		 WebElement clicklink = driver.findElement(By.xpath("//table/tbody/tr[th[.='"+name+"']]/td/a[.='"+linkText+"']"));
		    clicklink.click();
		
	}


}
