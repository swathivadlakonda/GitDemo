package WebTableAndCalenderConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCountTheNoOfrowsAndUsersrenabled {
	
	//Open url: https://opensource.demo.orangehrmlive.com.
	//login the account Admin/admin
	//open the page, go to Admin tab --> usermanagement -->users.
	// table will show, validate the all the row count in the wetable
	//count the no of users are enabled.
	
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// login page
		driver.findElement(By.xpath("(//input[@placeholder='Username'])[1]")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		
		//homepage
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='User Management']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']//li")).click();

		
		
		
		
	}
	
	

}
