package com.trinity.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5Alert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://nasscom.in/nasscom-membership");
		
		//click on go	
		driver.findElement(By.id("edit-submitted-contact-person-for-nasscom-email-id-cp")).click();
		
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		driver.switchTo().alert().dismiss();
		
		//driver.switchTo().alert().sendKeys("hello");
		
	}
}


