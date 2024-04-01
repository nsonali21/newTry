package com.qa.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Update {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.qa.jbktest.com/online-exam#Testing");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[text()='Manual Testing(ISTQB)']")).click();
	driver.findElement(By.id("countbtn")).click();
	driver.findElement(By.id("loginmobile")).sendKeys("1234562455");
	driver.findElement(By.id("loginbtn")).click();
	
	driver.findElement(By.partialLinkText("Account")).click();
//	driver.findElement(By.xpath("//*[text()='View Profile']")).click();
	driver.findElement(By.partialLinkText("View Profile")).click();
	driver.findElement(By.id("name")).clear();
	driver.findElement(By.id("name")).sendKeys("228 Special");
	
	driver.findElement(By.id("updatebtn")).click();
}
}

