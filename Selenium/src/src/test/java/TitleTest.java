package src.test.java;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleTest {

	@Test
	public void testgooglrsearch() {
		System.setProperty("webdriver.chrome.driver", "D:\\FUTURENOVA\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.in");
		// we expect the title “Google “ should be present
		String Expectedtitle = "Google";
		// it will fetch the actual title
		String Actualtitle = driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
		// it will compare actual title and expected title
		AssertJUnit.assertEquals(Actualtitle, Expectedtitle);
		// print out the result
		System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
	}
}