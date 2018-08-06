import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckRadio {
	WebDriver driver;
	@Test
	public void testClickJS() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\FUTURENOVA\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:8282/Selenium/pitzza.html");
		WebElement radiobut=driver.findElement(By.id("pizza"));
		radiobut.click();
		Select drpCountry = new Select(driver.findElement(By.id("sel")));	
		drpCountry.selectByVisibleText("Panner");
		drpCountry.selectByIndex(2);
	}
}












