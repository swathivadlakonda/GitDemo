package com.amazon.application;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTheCartItem {
	static WebDriver driver;
	public static void  explicitWait(WebElement element, Duration time ) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		  wait.until(ExpectedConditions.visibilityOf(element));
		
	}

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

		WebElement signIn = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[2]"));
	//	explicitWait(signIn,20);
		signIn.click();
		
		//Enter UserName and Password and login
		WebElement userName = driver.findElement(By.id("ap_email"));
		userName.sendKeys("madhavimanjaridd@gmail.com");
		
		WebElement contine = driver.findElement(By.id("continue"));
		contine.click();
		
		
		WebElement passWord = driver.findElement(By.id("ap_password"));
		passWord.sendKeys("Indian*1008");
		
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
		
		//Search Item for Iphone
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 256gb");
		search.submit();     // with the submit button we can enter the item to search, it act as enter button.
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click(); // by using search icon we can submit the item.
		
		WebElement iphone13 = driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 13 Mini, 256GB, Green - Unlocked (Renewed)')])[1]"));
			//explicitWait(iphone13,20);

		iphone13.click();
		
		//add the item to cart
		WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
		  addToCart.click();
		  
		  //no thanks button
	WebElement noThanks = driver.findElement(By.xpath("//input[@aria-labelledby='attachSiNoCoverage-announce']"));
	   noThanks.click();
		
	   //Procedure to checkout
	   WebElement checkout = driver.findElement(By.name("proceedToRetailCheckout"));
	   checkout.click();
	   
	   //add address
	   WebElement address = driver.findElement(By.id("addressChangeLinkId"));
	   address.click();
	   
	   WebElement addchange = driver.findElement(By.xpath("(//span[contains(text(),'4071 GRAMA TER, FREMONT, CA, 94536-4615, United States')])[1]"));
	   addchange.click();
	   
	   WebElement UseAddress = driver.findElement(By.xpath("//input[@aria-labelledby=\"shipToThisAddressButton-announce\"]"));
	   UseAddress.click();
		driver.get("https://www.amazon.com");

		
		
		
		
		
	}

}
