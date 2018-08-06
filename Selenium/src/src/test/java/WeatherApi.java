package src.test.java;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.apache.http.client.ClientProtocolException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("deprecation")
public class WeatherApi {
	private WebDriver driver;
	private String baseUrl;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\FUTURENOVA\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		    baseUrl = "http://openweathermap.org/current";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }
	

	@After
	public void tearDown() throws Exception {
		 driver.close();
		 driver.quit();
	}

	@Test
	public void test() throws ClientProtocolException, IOException {
		driver.get(baseUrl);
		driver.navigate().to("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");	
	 WebElement webElement=driver.findElement(By.tagName("pre"));
	 WeatherResponse weatherApiResponse=new WeatherResponse();
	 String ExpectedString=weatherApiResponse.GetResponse();
	 Assert.assertTrue(webElement.getText().equals(ExpectedString));
	}

}