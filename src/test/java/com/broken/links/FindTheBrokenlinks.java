package com.broken.links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTheBrokenlinks {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws  InterruptedException, IOException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http:www.amazon.in");
		
		//Capture the links count...By using findelements and tagname
		List<WebElement> links =  driver.findElements(By.tagName("a"));
	//    int totalLinks =	links.size();
     	System.out.println(links.size());
     	
     	
     	//We have to read every link......
     	for(int i =0; i<links.size(); i++) {
     		
     		WebElement ele = links.get(i);
     		String url = ele.getAttribute("href");
     		URL link = new URL(url);
     		//create a connection using the object 'link'
     		//we need connection for the url, this urlconnection will check wheather the perticular link is on the target or not..
     		
     		HttpURLConnection httpCon = (HttpURLConnection) link.openConnection();
     		Thread.sleep(2000);
     		httpCon.connect();
     		
     		int respcode = httpCon.getResponseCode(); //it will return the response code..
     		  if(respcode >= 400) {
     			  System.out.println(url +"  --- This is a brokenLink");
     		  }
     		  else
     		  {
     			  System.out.println(url+ "  --- this is a valid URL");
     		  }
     		
     	}
		

	}

}
