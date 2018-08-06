package src.test.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraTest {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		String baseUrl = "http://localhost:8888/links.html";
		System.setProperty("webdriver.chrome.driver", "D:\\srinivas\\selenium\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.myntra.com/");

		// Maximize Window
		driver.manage().window().maximize();

		// Mouse Over On " Men link "
		Actions act = new Actions(driver);
		By testlink = By.linkText("Men");
		WebElement test = driver.findElement(testlink);
		act.moveToElement(test).build().perform();

		driver.findElement(By.linkText("Bags & Backpacks")).click();

		// Click on the categories - Bag-packs
		driver.findElement(By.xpath("//*[text()='Categories']//following::li[1]/label")).click();

		// Mouse Hover on the 1st bag
		Actions sel = new Actions(driver);
		sel.moveToElement(driver.findElement(By.xpath("//ul[@class='results small']/li[1]"))).build().perform();

		// Click on the "Add to Bag" icon of the 1st bag
		driver.findElement(By.xpath("//ul[@class='results small']/li[1]/div[1]//div")).click();

		// Hover over the shopping bag icon present on the top navigation bar
		Actions mov = new Actions(driver);
		mov.moveToElement(driver.findElement(By.xpath("//a[contains(@class, 'cart')]//div"))).click().build().perform();

		// Click on the remove icon
		driver.findElement(By.xpath("(//span[@data-hint='REMOVE FROM BAG'])[1]")).click();

		// Closing current driver window
		driver.close();
	}
}