package com.training.selenium;

import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.Robot;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import javafx.scene.input.InputEvent;

public class RobotConcept {
static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Robot robot = new Robot();
		Thread.sleep(2000);
		      robot.mouseMove(730,150); //mouseMove(X-axis, Y-axis);
		      //to identify the  pixel size use this bellow command..
		  //    Dimension i = driver.manage().window().getSize(); 
			//	System.out.println("Dimension x and y :"+i.getWidth()+" "+i.getHeight()); 
		      robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		      robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		    //*---- keyboard Activity-----*//
		      robot.keyPress(KeyEvent.VK_CONTROL);
		      robot.keyPress(KeyEvent.VK_TAB);
		      Thread.sleep(2000);
		      robot.mouseWheel(20); 
		      //*---- keyboard Activity-----*//
		      
		

	}

}
