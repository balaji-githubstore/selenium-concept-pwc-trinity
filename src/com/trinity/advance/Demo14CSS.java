package com.trinity.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo14CSS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		driver.findElement(By.cssSelector("#email")).sendKeys("hello123");
		   
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("hello");
		
		driver.findElement(By.cssSelector("[type=submit]")).click();
	}

}
