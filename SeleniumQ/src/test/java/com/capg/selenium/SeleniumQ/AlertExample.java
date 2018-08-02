package com.capg.selenium.SeleniumQ;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertExample {

	static Logger logg=Logger.getLogger(AlertExample.class.getName());
	WebDriver driver;
	
	@Test
	public void ExampleForAlert() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\srinivas\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Alerts file local
//	 	driver.get("http://localhost:5555/SeleniumWeb/Alerts.html");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@onclick="+"'alertFunction()']")).click();
//		Alert alert=driver.switchTo().alert();
//		logg.info(alert.getText());
//		alert.accept();
		
		//google search
//		driver.get("http://www.google.co.in");
//		Thread.sleep(2000);
//		driver.findElement(By.id("lst-ib")).sendKeys("mobile");
//		driver.findElement(By.name("btnK")).click();

		
		//amazon.in search
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.className("nav-input")).click();
		
		logg.info("Done");
		//driver.close();
	}
}
