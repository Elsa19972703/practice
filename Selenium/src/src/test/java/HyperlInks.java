package src.test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlInks {
	static WebDriver driver;

	public static void main(String[] args) {
		String baseUrl = "http://localhost:8081/Selenium/links.html";
		System.setProperty("webdriver.chrome.driver", "D:\\srinivas\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.findElement(By.partialLinkText("Inside")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Outside")).click();
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
