package com.DynamicTableExcel.copy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableDataTranferToExcelSheet {
      static WebDriver driver;
      
      
      
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 driver.manage().window().maximize();
		
		 driver.get("https://demo.guru99.com/test/web-table-element.php");
		 WebElement table = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tbody"));
         int rowcount = table.findElements(By.xpath("//tr")).size();
         System.out.println(rowcount);
         System.out.println("------------------------------- ");
         // int colcount = table.findElements(By.xpath("//tr//th")).size();
         //  System.out.println(colcount);
           
        //Creating a ExcelSheet....
          // String path = "C:\\Users\\swath\\OneDrive\\Desktop\\workbook3.xlsx";
           String path = "C:\\Users\\swath\\eclipse-workspace\\SeleniumConcept\\Screenshorts\\webtable.xlsx";
           XlUtility xlutil = new XlUtility(path); // creating Xlutility class object, so that can use those methods here
    
           //write header in the Excel sheet
           xlutil.setCellDataValues("Sheet1", 0, 0,"Company");
           xlutil.setCellDataValues("Sheet1", 0, 1,"Group");
           xlutil.setCellDataValues("Sheet1", 0, 2,"Prev Close (Rs)");
           xlutil.setCellDataValues("Sheet1", 0, 3,"Current Price (Rs)");
           xlutil.setCellDataValues("Sheet1", 0, 4,"% Change");
          
         
           for(int r=1;r<rowcount-1; r++) {
        	String company =  driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tbody//tr["+r+"]//td[1]")).getText();
        	String Group = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tbody//tr["+r+"]//td[2]")).getText();
        	String PrevClose =  driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tbody//tr["+r+"]//td[3]")).getText();
        	String Currentprice =  driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tbody//tr["+r+"]//td[4]")).getText();
        	String  Change =  driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tbody//tr["+r+"]//td[5]")).getText();
 
        	System.out.println(company+ " "  +Group+" " +PrevClose+" " +Currentprice+" " +Change);
           
           
           //writing the data in to the excel sheet.
        	 	xlutil.setCellDataValues("Sheet1", r, 0,company);
                xlutil.setCellDataValues("Sheet1", r, 1,Group);
                xlutil.setCellDataValues("Sheet1", r, 2,PrevClose);
                xlutil.setCellDataValues("Sheet1", r, 3,Currentprice);
                xlutil.setCellDataValues("Sheet1", r, 4, Change);
                
                  
           
           
           }
           System.out.println("------------------------------- ");
           System.out.println("webTable data transferd successfully in excel");
	}

}
