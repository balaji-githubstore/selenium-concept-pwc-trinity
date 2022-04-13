package com.trinity.advance;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2MultipleTabs {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		
		List<String> colors=new ArrayList<String>(driver.getWindowHandles());
		//switch to second tab
		driver.switchTo().window(colors.get(1));
		
		String tab2Url=driver.getCurrentUrl();
		System.out.println(tab2Url);
		
		driver.findElement(By.id("email-or-phone")).sendKeys("bala@gmail.com");
		driver.findElement(By.id("password")).sendKeys("pass123");
		driver.findElement(By.id("join-form-submit")).click();
		
		driver.close();
		
		//switch to 1st tab
		driver.switchTo().window(colors.get(0));
		
		String tab1Url=driver.getCurrentUrl();
		System.out.println(tab1Url);
	}

}
