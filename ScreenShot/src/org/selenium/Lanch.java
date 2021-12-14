package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lanch {
	
	static WebDriver driver ;
	    public static void screenshot(String Name) throws IOException {
	    	
	    	TakesScreenshot tk = (TakesScreenshot)driver;
			
	    	File src = tk.getScreenshotAs(OutputType.FILE);
	    	
	    	System.out.println(src);
	    	File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\ScreenShot\\Screenshotsone\\fblogin.png");
	    	FileUtils.copyFile(src, des);
	    	

		}      
	    
        public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\ScreenShot\\driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		screenshot("login");
		
	}

}
