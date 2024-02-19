package sauceDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAll6ItemsInPage {

	public static void main(String[] args) {
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	
	List<WebElement> items =	driver.findElements(By.xpath("//div[@id=\"login_credentials\"]/br"));
	//List<WebElement> items =	driver.findElements(By.xpath("//br"));

                  System.out.println(items.size());
                 
                  
                  for(WebElement ele:items) {
                	  System.out.println(ele.getText());
                  }

	}

}
