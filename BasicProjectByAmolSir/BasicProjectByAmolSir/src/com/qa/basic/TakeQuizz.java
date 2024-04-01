package com.qa.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TakeQuizz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam#Testing");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Manual Testing(ISTQB)']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("loginmobile")).sendKeys("1234562455");
		driver.findElement(By.id("loginbtn")).click();
		
		Actions act = new Actions(driver);
		
		for(int i=0;i<10;i++) {
			
			WebElement nextBtn=driver.findElement(By.xpath("//*[text()='Next »']"));
			JavascriptExecutor jsExcuter = (JavascriptExecutor) driver;
			jsExcuter.executeScript("arguments[0].scrollIntoView(true);", nextBtn);
			Thread.sleep(4000);
		    
			nextBtn.click();
		}
		
//		driver.findElement(By.id("qsubmit")).click();
	}

}
