package com.qa.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAttemt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam#Testing");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing(ISTQB)']")).click();
		WebElement nextBtn=driver.findElement(By.id("countbtn"));
		nextBtn.click();
		
		WebElement mobno=driver.findElement(By.id("loginmobile"));
		mobno.sendKeys("1234562455");
		driver.findElement(By.id("loginbtn")).click();
		
		WebElement myAccount=driver.findElement(By.partialLinkText("My Account"));
		myAccount.click();
		
		driver.findElements(By.className("text-white")).get(0).click();
	
	}

}
