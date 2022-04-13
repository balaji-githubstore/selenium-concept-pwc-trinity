package com.trinity.advance;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3MultipleTabs {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
			
		List<String> colors=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(colors.get(1));

		driver.findElement(By.partialLinkText("New Account")).click();	
		driver.findElement(By.name("firstname")).sendKeys("Balaji");		
		driver.findElement(By.name("lastname")).sendKeys("Dinakaran");
		

	}

}
