package com.trinity.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2FBSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		
		String header=driver.findElement(By.xpath("//h2")).getText();
		System.out.println(header);
		
		driver.findElement(By.partialLinkText("New Account")).click();	
		
		driver.findElement(By.name("firstname")).sendKeys("Balaji");
		
		driver.findElement(By.name("lastname")).sendKeys("Dinakaran");
		
		driver.findElement(By.name("reg_email__")).sendKeys("7889988544");
		
		driver.findElement(By.id("password_step_input")).sendKeys("welcome");
		
		
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("21");
//		selectDay.selectByIndex(0);
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Dec");
		
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		Select selectPronoun=new Select(driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']")));
		selectPronoun.selectByValue("6");
		
//		driver.findElement(By.name("websubmit")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		//element should be visible //explicit wait
		Thread.sleep(5000);

		String text=driver.findElement(By.xpath("//div[contains(text(),'secure')]")).getText();
		System.out.println(text);
		
		//will start at 11:25 AM MYT
	}

}
