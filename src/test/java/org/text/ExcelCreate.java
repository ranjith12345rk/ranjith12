package org.text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.netty.util.internal.SystemPropertyUtil;

public class ExcelCreate {
	public static void main(String[] args) throws IOException{
		File loc=new File("C:\\Users\\Preetha Ranjith\\eclipse-workspace\\MavenTest\\src\\test\\resources\\Datas\\facebook.xlsx");
	
		//WORKBOOK
//		FileInputStream fi=new FileInputStream(loc);
//		
//	Workbook w=new XSSFWorkbook(fi);
//////		
//		Sheet s=w.createSheet("Sheet2");
//////		
//		Row row=s.createRow(3);
//		Cell cell=row.createCell(1);
//		cell.setCellValue("preethu");
//		System.out.println(cell);
//		int cellcounts = row.getPhysicalNumberOfCells();
//		System.out.println(cellcounts);
//		
//		
//		Existing system
		FileInputStream fi=new FileInputStream(loc);
		Workbook w1=new XSSFWorkbook(fi);
		Sheet s1=w1.getSheet("Sheet2");
		Row row = s1.getRow(4);
		Cell cell = row.getCell(2);
		System.out.println(cell);

		for(int i=0;i<s1.getPhysicalNumberOfRows();i++){
			Row rows=s1.getRow(i);
			for(int j=0;j<rows.getPhysicalNumberOfCells();j++) {
				Cell cells=rows.getCell(j);
				System.out.println(cells);	
		// type
//1----String
//		0...number,date
		int type = cell.getCellType();
		System.out.println(type);
		
	   if(type==1) {
		   String value = cell.getStringCellValue();
		  System.out.println(value);
	   }
	   else {
		   if(DateUtil.isCellDateFormatted(cell)){
			   Date date = cell.getDateCellValue();
			   SimpleDateFormat si=new SimpleDateFormat("dd/MMM/yyyy");
			   String value = si.format(date);
			   System.out.println(value);
			   
		   }
		   else {
			   double db = cell.getNumericCellValue();
			   long l=(long)db;
			   String value = String.valueOf(1);
			  
		   }
	   }
			}
		}
	}
		   
}
	   
			
		
		
		
				

		
		
		
		
		
	
	
	


