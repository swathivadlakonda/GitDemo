package com.training.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robotpixelconcept {
WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-webdriver/robot-class-mouse-events/");
		driver.manage().window().maximize();
		WebElement robo = driver.findElement(By.xpath("//span[text()='Tutorials']"));
		Robot robot = new Robot();	
		Thread.sleep(5000);
		Dimension i = driver.manage().window().getSize(); 
		System.out.println("Dimension x and y :"+i.getWidth()+" "+i.getHeight()); 
	      robot.mouseMove(1552,832); //mouseMove(X-axis, Y-axis);

		//robo.click();
		 // robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	     // robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

}
