package org.text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {
	public static void main(String[] args) throws IOException    {
		File loc=new File("C:\\Users\\Preetha Ranjith\\eclipse-workspace\\MavenTest\\src\\test\\resources\\facebook.xlsx");
		FileInputStream fi=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(fi);
//		//SHEET
		Sheet s=w.getSheet("Sheet2");
//		//ROW
		Row row=s.getRow(2);
//		//cell
		Cell cell=row.getCell(0);
		System.out.println(cell);
		int rowcounts = s.getPhysicalNumberOfRows();
		System.out.println(rowcounts);
		int cellcounts = row.getPhysicalNumberOfCells();
		System.out.println(cellcounts);
		for(int i=0;i<s.getPhysicalNumberOfRows();i++){
			Row rows=s.getRow(i);
			for(int j=0;j<rows.getPhysicalNumberOfCells();j++) {
				Cell cells=rows.getCell(j);
				System.out.println(cells);
			}
	}
		
	}
}