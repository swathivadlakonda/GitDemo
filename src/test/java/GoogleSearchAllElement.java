import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchAllElement {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		  search.sendKeys("selenium");
		  Thread.sleep(5000);
		  
		  
		  List<WebElement> alldata = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		  System.out.println(alldata.size());
		      for(WebElement ele:alldata)
		      {
		    	 System.out.println(ele.getText());
		      }

	}

}
