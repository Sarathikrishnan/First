package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchMavenProject {
	public static void main(String[] args) throws IOException {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\LaunchMaven\\Book\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fs);
	// which sheet to read
	Sheet sheet = w.getSheet("Sheet1");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(1);
	double numericCellValue = cell.getNumericCellValue();
//type casting
	long l = (long)numericCellValue;
	System.out.println(l);
	
	
	}
	
	

}
