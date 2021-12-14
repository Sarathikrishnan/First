package org.base;

import org.openqa.selenium.WebElement;

public class Basetest2 extends Baseclasstest {
	
	public static void main(String[] args) {
		getDriver();
		Lanch("https://www.facebook.com/");
		WebElement textuser = xpath("//*[@id=\"email\"]");
		textsend("jack@gmail.com",textuser);
		WebElement textpass = xpath("//*[@id=\"pass\"]");
		textsend("123456",textpass);
		WebElement click = xpath("//button[@name='login']");
	    click.click();
	}



}
