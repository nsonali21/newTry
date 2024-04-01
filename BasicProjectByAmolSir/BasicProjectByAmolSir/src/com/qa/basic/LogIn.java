package com.qa.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam#Testing");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing(ISTQB)']")).click();
		WebElement nextBtn=driver.findElement(By.id("countbtn"));
		nextBtn.click();
		
//		WebElement login=driver.findElement(By.linkText("Login"));
//		driver.findElement(By.id("signin-tab")).click();
		
//		driver.findElement(By.xpath("//*[@id='signin-tab']")).click();
//		login.click();
		
	//Bug in site
		
		
		
		WebElement mobno=driver.findElement(By.id("loginmobile"));
		mobno.sendKeys("1234562455");
		driver.findElement(By.id("loginbtn")).click();
		
		//MyAccount module
//		Ask Why
//		WebElement myAccount=driver.findElement(By.linkText(" My Account"));
		WebElement myAccount=driver.findElement(By.partialLinkText("My Account"));

//		WebElement myAccount=driver.findElement(By.xpath(""));

		myAccount.click();
		WebElement myProfile=driver.findElement(By.partialLinkText("View Profile"));
		myProfile.click();
		
		WebElement name_updt=driver.findElement(By.id("name"));
		name_updt.sendKeys("ABC");
		
		WebElement update_btn=driver.findElement(By.id("updatebtn"));
		update_btn.click();
		
		WebElement logout=driver.findElement(By.linkText("Logout"));
		logout.click();
		
}
}
