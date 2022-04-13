package com.trinity.advance;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo14Findelements {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://google.com/");
		
		List<WebElement> elements= driver.findElements(By.xpath("//a"));
		int count=elements.size();
		System.out.println(count);
		
		//click on first element
		//elements.get(1).click();
		
		for(int i=0;i<count;i++)
		{
			String text = elements.get(i).getText();
			System.out.println(text);
			
			String att = elements.get(i).getAttribute("href");
			System.out.println(att);
		}
	}

}





