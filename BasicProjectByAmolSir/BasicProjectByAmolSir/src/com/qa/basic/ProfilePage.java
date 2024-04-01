package com.qa.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProfilePage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.partialLinkText("Java Certification")).click();
//		driver.findElement(By.partialLinkText("test2")).click();
//		driver.findElement(By.partialLinkText("test2")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()=\"Abstraction\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='radio'and @value='10']")).click();
		driver.findElement(By.id("countbtn")).click();	
		WebElement mobile=driver.findElement(By.id("//*[@id='loginmobile']"));
		mobile.sendKeys("1234562455");
		
	}
	
	
}
