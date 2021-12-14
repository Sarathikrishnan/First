package org.frameone;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOne {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Frames\\driver\\chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://output.jsbin.com/osebed/2");
		 
		 WebElement multiSelect = driver.findElement(By.id("fruits"));
		 
		 Select s = new Select( multiSelect);
		 
		 s.selectByIndex(2);
		 s.selectByValue("apple");
		 s.selectByVisibleText("Grape");
		 
		 
		 boolean multiple = s.isMultiple();
		 System.out.println(multiple);
		 
		 
		 
	
		 
		 
			 
	}

}
