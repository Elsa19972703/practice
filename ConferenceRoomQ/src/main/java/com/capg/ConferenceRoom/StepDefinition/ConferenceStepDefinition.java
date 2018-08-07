package com.capg.ConferenceRoom.StepDefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.capg.ConferenceRoom.Bean.LoginBean;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ConferenceStepDefinition {

	LoginBean pagebean = new LoginBean();
	static WebDriver driver;

	@Before
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "D:\\srinivas\\selenium\\chromedriver.exe");
	}

	@Given("^I have the login page$")
	public void i_have_the_login_page() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://localhost:8081/ConferenceRoomW/login.html");
		driver.get("file:///D:/Kavya_BDDExercises/ConferenceRoomQ/login.html");

		PageFactory.initElements(driver, pagebean);
	}

	@When("^I have correct username and password$")
	public void i_have_correct_username_and_password() throws Throwable {
		pagebean.setUsername("kavya");
		pagebean.setPassword("passwordkk");
		Thread.sleep(2000);
		pagebean.submit();
		Thread.sleep(2000);
		
	}

	@Then("^login to the site$")
	public void login_to_the_site() throws Throwable {

	Assert.assertEquals("Google", driver.getTitle());
		
	}
	
	@After
	public void end() {
		driver.close();
	}

}
