package org.text;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreate1 {
	public static void main(String[] args) {
		File loc=new File("C:\\Users\\Preetha Ranjith\\eclipse-workspace\\MavenTest\\src\\test\\resources\\Datas\\facebook.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s=w.createSheet("Sheet1");
	  Row row = s.createRow(2);
	 
	  Cell cell = row.createCell(2);
	  
	  System.out.println(cell);
		
	}

}
