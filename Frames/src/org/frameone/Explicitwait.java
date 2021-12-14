package org.frameone;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Frames\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement textuser = driver.findElement(By.id("email"));
		textuser.sendKeys("jack@gmail.com");
		

		WebDriverWait w = new WebDriverWait(driver,5);
		
		WebElement Util= w.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
	Util.sendKeys("234563456");
	
	WebElement login = driver.findElement(By.name("login"));
	login.click();
		
		
		
		
	
		
	}

}
