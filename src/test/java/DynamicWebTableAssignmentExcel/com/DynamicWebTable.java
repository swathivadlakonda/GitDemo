package DynamicWebTableAssignmentExcel.com;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	static WebDriver driver;
    static int rowcount;
    static int colcount;
public static void main(String[] args) {
             driver = new ChromeDriver();
            driver.get("https://demo.guru99.com/test/web-table-element.php");
            driver.manage().window().maximize();
            
             rowcount = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr")).size();
            System.out.println(rowcount);
            
             colcount = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr//th")).size();
              System.out.println(colcount);
              
            
            String companyName = "IDFC L";
            
              rowdata(companyName);
   // String rowVol = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr[2]")).getText();
  //  System.out.println(rowVol);
          
            
   	       
	}
	public static void rowdata(String companyName) {
		
	
	
	      for(int i = 2; i<rowcount; i++) {
	    	  for(int j =1; j<colcount; j++ ) {
	    		  
	        		String rowVol = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr[" +i+ "]//td["+j+"]")).getText();
                    if(rowVol.equals(companyName)) {
                    	
                    	String rowdata = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr[" +i+ "]")).getText();
                    	System.out.println(rowdata);
                    	break;
                    }
                    
	    	  }
	    	  
             
          
        		
        	
	      	 
           }
	      System.out.println("The companyname is not present");
	    
        	
}   
}
        	



