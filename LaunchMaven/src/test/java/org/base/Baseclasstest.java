package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclasstest {
	static WebDriver driver;
	
	static WebElement FindElement;
	
	public static WebDriver getDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static void Lanch(String url) {
		driver.get(url);

	}
	public static WebElement xpath(String xpathvalue) {
		WebElement FindElement = driver.findElement(By.xpath(xpathvalue));
		return FindElement;
		
	}
	
	public static void textsend(String text,WebElement refname) {
		refname.sendKeys(text);
		}
	public static void ButtonClick(WebElement refname) {
		refname.click();

	}
	

}
