package com.conference.ConfrenceTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readonlyTest {

static WebDriver driver;
	

	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "D:\\srinivas\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/ConferenceRoom/readonly.html");
		
		WebElement str=driver.findElement(By.name("name"));
		System.out.println("Readonly is "+str.getAttribute("value"));
		assertEquals("capgemini",str.getAttribute("value"));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
