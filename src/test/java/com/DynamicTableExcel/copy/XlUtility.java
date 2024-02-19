package com.DynamicTableExcel.copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlUtility {
	public FileInputStream fileInput;
	public FileOutputStream fileOutput;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	String path = null;
	
	XlUtility(String path){   // creating a constructor, whenever you call these methods in this file, this constructor will help to call these methods, where ever you want
		this.path = path;   //this constructor take the path of the Excel, this path assigned to the local variables
	}

	public int getRowCount(String sheetName) throws IOException {
		fileInput = new FileInputStream(path);
		workbook = new XSSFWorkbook(fileInput);
		sheet = workbook.getSheet(sheetName);
		int rowcount = sheet.getLastRowNum();
		workbook.close();
		fileInput.close();
		return rowcount;
	}
	
	
	public int getCellCount(String sheetName, int rownum ) throws IOException {
		fileInput = new FileInputStream(path);
		workbook = new XSSFWorkbook(fileInput);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rownum);
		int cellcount = row.getLastCellNum();
		workbook.close();
		fileInput.close();
		return cellcount;
		
		
		
	}

	public String getCellData(String sheetName, int rownum, int colnum) throws IOException {
		fileInput = new FileInputStream(path);
		workbook = new XSSFWorkbook(fileInput);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rownum);
		cell =row.getCell(colnum);
		
		DataFormatter formatter = new DataFormatter();
		String data;
		try {
			data = formatter.formatCellValue(cell);// return the formatted value of a cell as a string regardless of the cell type.
		}                                            //return the data from the cell in the string format.
		catch(Exception e) 
		{
		data =" ";
		}
		
			
			workbook.close();
			fileInput.close();
			return data;
		}

	public void setCellData(String sheetName, int rownum, int colnum,String data) throws IOException {
		fileInput = new FileInputStream(path);
		workbook = new XSSFWorkbook(fileInput);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rownum);
		cell =row.createCell(colnum);
		cell.setCellValue(data);
		
		fileOutput = new FileOutputStream(path);
		workbook.write(fileOutput);
		workbook.close();
		fileInput.close();
		fileOutput.close();
		
	

	}
	
	// this method is used for the create a excel sheet and transfer the data into the excel
	public  void setCellDataValues(String sheetName, int rownum, int colnum,String data) throws IOException {
	File Xlfile = new File(path);
	if(!Xlfile.exists()) {    // if file is not exit then create a new file
		workbook = new XSSFWorkbook();
		fileOutput = new FileOutputStream(path);
		workbook.write(fileOutput);
	}
	fileInput = new FileInputStream(path);
	workbook = new XSSFWorkbook(fileInput);
	   if(workbook.getSheetIndex(sheetName)== -1)//if sheet is not exit then create a new sheer
		   workbook.createSheet(sheetName);
	   
	   sheet = workbook.getSheet(sheetName);
	
	  if(sheet.getRow(rownum)== null)   // if row is not exit, then create a new row, if exit then get the row
		  sheet.createRow(rownum);
	  
	  row= sheet.getRow(rownum);
	  
	  cell = row.createCell(colnum);
	  cell.setCellValue(data);
	  fileOutput = new FileOutputStream(path);
		workbook.write(fileOutput);
		workbook.close();
		fileInput.close();
		fileOutput.close();
	  
	  
	  
	  
	  
	  
	}
	
	public void fillGreenColor(String sheetName, int rownum, int colnum) throws IOException {
		fileInput = new FileInputStream(path);
		workbook = new XSSFWorkbook(fileInput);
		sheet = workbook.getSheet(sheetName);
		
		row = sheet.getRow(rownum);
		cell =row.createCell(colnum);
		
	    style = workbook.createCellStyle();
	    style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    
	    cell.setCellStyle(style);  // this is for fill the color of the cell by using create cell style
	    workbook.write(fileOutput);
	    workbook.close();
	    fileInput.close();
	    fileOutput.close();
	}
	
	
	public void fillRedColor(String sheetName, int rownum, int colnum) throws IOException {
		fileInput = new FileInputStream(path);
		workbook = new XSSFWorkbook(fileInput);
		sheet = workbook.getSheet(sheetName);
		
		row = sheet.getRow(rownum);
		cell =row.createCell(colnum);
		
	    style = workbook.createCellStyle();
	    style.setFillForegroundColor(IndexedColors.RED.getIndex());
	    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    
	    cell.setCellStyle(style);  // this is for fill the color of the cell by using create cell style
	    workbook.write(fileOutput);
	    workbook.close();
	    fileInput.close();
	    fileOutput.close();
	}
	
	
}

	
