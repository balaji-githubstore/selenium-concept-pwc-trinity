package com.trinity.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1OrangeHrm {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		
		driver.findElement(By.id("membership_subscriptionCommenceDate")).clear();
		driver.findElement(By.id("membership_subscriptionCommenceDate")).sendKeys("2022-04-22");
	}

}


