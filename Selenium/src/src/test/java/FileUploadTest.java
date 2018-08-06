package src.test.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import java.io.File;

public class FileUploadTest {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
    	System.setProperty("webdriver.chrome.driver", "D:\\srinivas\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
    }

       @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void uploadFile() throws Exception {
        String filename = "D:\\error.png";
        File file = new File(filename);
        String path = file.getAbsolutePath();
        System.out.println(path);
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys(path);
        driver.findElement(By.id("file-submit")).click();
        String text = driver.findElement(By.id("uploaded-files")).getText();
        System.out.println(text+"....");
        assertThat("D:\\"+text, is(equalTo(filename)));
    }

}