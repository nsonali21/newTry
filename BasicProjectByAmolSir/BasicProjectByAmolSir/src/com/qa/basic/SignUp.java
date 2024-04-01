package com.qa.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam#Testing");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing(ISTQB)']")).click();
		WebElement nextBtn=driver.findElement(By.id("countbtn"));
		nextBtn.click();

		WebElement signupBtn=driver.findElement(By.id("signup-tab"));
		signupBtn.click();

		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Mpnm");

		WebElement email=driver.findElement(By.id("emailid"));
		email.sendKeys("hma@gmail.com");

		WebElement mobile=driver.findElement(By.id("mobile"));
		mobile.sendKeys("1234562455");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//		js.executeScript("window.scrollBy(0,250)", "");

		WebElement chkbox=driver.findElement(By.id("agree"));
		js.executeScript("arguments[0].scrollIntoView();", chkbox);
		chkbox.click();

		WebElement proceed=driver.findElement(By.id("emailbtn"));
		proceed.click();





	}

}
