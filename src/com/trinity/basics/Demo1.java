package com.trinity.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	
	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
	
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		By loc= By.id("email");
		WebElement ele= driver.findElement(loc);	
		ele.sendKeys("hello");
		
	
	  // driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
	   
	   driver.findElement(By.id("pass")).sendKeys("hello123");
	   
	   driver.findElement(By.name("login")).click();
	   
	 //  driver.findElement(By.linkText("Create New Account")).click();
		//driver.findElement(By.partialLinkText("New Acc")).click();
	   
	   WebElement ele1= driver.findElement(By.partialLinkText("New Account"));
		ele1.click();
	}
}
