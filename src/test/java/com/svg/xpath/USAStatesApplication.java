package com.svg.xpath;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class USAStatesApplication {
                static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/forecast-map");
//		Robot robo = new Robot();
//		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
//		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='map-instance-14492']"));
		driver.switchTo().frame(iframe);
System.out.println("helloo");
		

}
}
