package org.base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datatest {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\LaunchMaven\\Book\\Book1.xlsx");
		
		Workbook b = new XSSFWorkbook();
		
		
		Sheet createSheet = b.createSheet("Iphone");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchbox.sendKeys("iphone 13pro",Keys.ENTER);
		
		List<WebElement> iphone = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for (int i = 0; i < iphone.size(); i++) {
			
			WebElement element = iphone.get(i);
			
			String text = element.getText();
			
			System.out.println(text);
			
			Row createRow = createSheet.createRow(i);
			
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);
			
		}
		
		FileOutputStream fileout = new FileOutputStream(f);
		
		b.write(fileout);
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 
	
	
	
	
	
	


