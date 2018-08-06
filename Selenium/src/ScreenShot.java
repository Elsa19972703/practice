import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenShot {
@Test
public void TestJavaS1()
{
	System.setProperty("webdriver.chrome.driver",
			"D:\\FUTURENOVA\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver	driver = new ChromeDriver();

// Maximize the window
driver.manage().window().maximize();

// Pass the url
driver.get("https://www.google.com");

File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {

FileUtils.copyFile(src, new File("D:/error.png"));
}
catch (IOException e)
{
  System.out.println(e.getMessage());
}
}
}