package LPLSearch;
//write Silenium code to open Google page, search for "LPL", Validate "LPL" is found in web page?
//Ques-3 - Open Browser validate google opened, search for lpl, validate lpl results displayed



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LPLInformationValidate {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.google.com/");
     WebElement search = driver.findElement(By.id("APjFqb"));
    // Thread.sleep(5000);
            search.sendKeys("LPL");
            search.getText();
            System.out.println( search.getText());
            
            search.submit();
            String pageSource = driver.getPageSource();
           // System.out.println(pageSource);

            boolean isLPLFound = pageSource.contains("LPL");

            if (isLPLFound) {
                System.out.println("LPL search results are displayed.");
            } else {
                System.out.println("LPL search results are not displayed.");
            }

            // Close the browser
           // driver.quit();
        }
    
   





            

	}


