package org.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateOne {
	public static void main(String[] args) throws IOException {
		
		
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\LaunchMaven\\Book\\Book1.xlsx");
		
		Workbook b = new XSSFWorkbook();
		
		Sheet createsheet = b.createSheet("DataDriver");
		
		Row createRow = createsheet.createRow(0);
		
		Cell createCell = createRow.createCell(1);
		
		createCell.setCellValue("jack");
		
		FileOutputStream fileout = new FileOutputStream(f);
		
		b.write(fileout);
	}
	
	
	
	

}
