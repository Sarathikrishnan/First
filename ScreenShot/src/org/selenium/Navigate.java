package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\ScreenShot\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		
		driver.navigate().back();
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
	}

}
