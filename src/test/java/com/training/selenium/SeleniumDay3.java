package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay3 {
WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver   driver = new ChromeDriver();
	driver.get("https://selenium-prd.firebaseapp.com/home.html");
	driver.manage().window().maximize();    //How to Maximize the Screen
	String exceptedvalue = "Selenium";
	String title = driver.getTitle();
	System.out.println("The Title of the page is: "+title); // How to find the title of the currentPage or webPage
	
	if(exceptedvalue.equals(title)) {
		System.out.println("TestCase Passed");   //How to do Validation weather it is correct title or not.
	}else
		System.out.println("Testcase Failed");
		
	
	
	 ///*--------OtherWay to do findElements by using webElement retunType-------*///
	   
	   
	   WebElement email = driver.findElement(By.id("email_field"));   //Enter the email and display email-id here
	//WebElement email = driver.findElement(By.cssSelector("#email_field"));
	             email.sendKeys("admin123@gmail.com");
	             
	   WebElement password = driver.findElement(By.cssSelector("#password_field"));    //cssSelector is a HTML TechKowledge, is another way to find the element
	             password.sendKeys("admin123");                                      //Enter the Password
	             
	   WebElement login = driver.findElement(By.xpath("//button[text() ='Login to Account']"));  //login in to the page.
	             login.click();
	             
	 
	 //After login the page will go next page, when we try to enter the name it will not display it will throw an exception so we need to wait for the element
	//for that we need to make the element to sleep, for that we need to give thread.sleep(5000). like 5 Sec (5000)wait time. for this we need to do for every new page when we find the  element for new page and that to we need to do for first element only.
	             
	   //------*Waiting for an Element*------//          
	 
	   Thread.sleep(5000);  // when we write this function we will get checked exception, for that we need to throws an exception or we can use try-catch Exception.
	   WebElement name = driver.findElement(By.id("name"));  //we did Enter the name here
	              name.sendKeys("Sanskriti");
	              
	   WebElement fathername = driver.findElement(By.cssSelector("#lname")); //we entered fatherName 
	              fathername.sendKeys("RamPrasad");
	             
	   WebElement address = driver.findElement(By.cssSelector("#postaladdress")); //we entered postalAddress by using cssSelector
	              address.sendKeys("4071 GramaTerrace");   
	              
	              
	    WebElement personaladdrs = driver.findElement(By.id("personaladdress")); //we entered personalAddress by using id
	              personaladdrs.sendKeys("4071 Grama Terrace");   
	              
	    WebElement femailradio = driver.findElement(By.xpath("//input[@value='female']"));   // select the radio button element
	               femailradio.click();
	               
	               
	              
	               //3-types of dropDowns are selectByValue,SelectByVisible,SelectByIndex
	      //-----Dropdowm-Element------// for this we need to create select class for this we need to create an object for select          
	    WebElement citydropdown = driver.findElement(By.id("city"));    // city dropDown.......
	       Select city = new Select(citydropdown);
	            city.selectByVisibleText("GOA");  //select by Visible....
	        
	    
	    WebElement coursedropdown = driver.findElement(By.id("course"));  // course dropDown........
	         Select course = new Select(coursedropdown);
	                course.selectByValue("mba");    // Select by Value....   check to find the element value in small letters for Ex: <option value="mba">MBA</option>
	    
	    WebElement districtdropdown = driver.findElement(By.name("district"));
	        Select district = new Select(districtdropdown);
	               district.selectByIndex(4);    // Select by Index{0,1,2,3,4......}
	               
	               
	    WebElement pincode = driver.findElement(By.cssSelector("#pincode"));  //pincode..
	               pincode.sendKeys("94536");
	               
	   WebElement emailid = driver.findElement(By.cssSelector("#emailid"));  //emailId
	              emailid.sendKeys("Sitaram@gmail.com");
	              
	   WebElement submit = driver.findElement(By.xpath("//button[@class='bootbutton']"));
	             submit.click();
	              
	          
	              
	              
	              
	             
	             
 
	}

}
