import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class AlertExample {

	WebDriver driver;

	@Test
	public void ExampleForAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\FUTURENOVA\\selenium\\chromedriver_win32\\" + 
		"chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://din66007746:8085/Selenium/"
				+ "Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick="
				+ "'alertFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("Done");
	}

}
