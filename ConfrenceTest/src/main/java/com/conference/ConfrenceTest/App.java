package com.conference.ConfrenceTest;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App {
	WebDriver driver;

	@Test
	public void ExampleForAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\srinivas\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/ConferenceRoom/ConferenceRegistartion.html");
		
       driver.findElement(By.id("txtFirstName")).sendKeys("kavya");
       driver.findElement(By.id("txtLastName")).sendKeys("kilari");
       driver.findElement(By.id("txtEmail")).sendKeys("kavya@capgemini.com");
       driver.findElement(By.id("txtPhone")).sendKeys("9789978989");
       
       WebElement element = driver.findElement(By.name("size"));
       Select se=new Select(element);
       se.selectByValue("two");
       driver.findElement(By.id("txtAddress1")).sendKeys("Anjaiah Nagar");
       driver.findElement(By.id("txtAddress2")).sendKeys("Gachibowli");
       
       WebElement element1 = driver.findElement(By.name("city"));
       Select se1=new Select(element1);
       se1.selectByValue("Hyderabad");
       
       WebElement element2 = driver.findElement(By.name("state"));
       Select se2=new Select(element2);
       se2.selectByValue("Telangana");
       
       driver.findElement(By.name("memberStatus")).click();
       driver.findElement(By.linkText("Next")).click();
       Thread.sleep(3000);
       
       Alert alt=driver.switchTo().alert();
       alt.accept();
       Thread.sleep(3000);
       
       driver.findElement(By.id("txtCardholderName")).sendKeys("kavya");
       driver.findElement(By.id("txtDebit")).sendKeys("12412341234");
       driver.findElement(By.id("txtCvv")).sendKeys("567");
       driver.findElement(By.id("txtMonth")).sendKeys("August");
       driver.findElement(By.id("txtYear")).sendKeys("2019");
       Thread.sleep(3000);
       
       driver.findElement(By.id("btnPayment")).click();
       Alert alt1=driver.switchTo().alert();
       alt1.accept();
       Thread.sleep(3000);
       
		driver.close();
	
	}
}
