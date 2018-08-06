package com.conference.ConfrenceTest;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorTest {

	static WebDriver driver;
	
	@Before
	public void initialization() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\srinivas\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() {
		try {
			 i_want_to_add_two_numbers();
			 i_add_and(10, 20);
			 i_get_the_result_as(30);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			System.out.println("Logged in!");
		}
	}

	
	@Given("^I want to add two numbers$")
	public void i_want_to_add_two_numbers() throws Throwable {
	 System.out.println("i have calculator");
	 
	 
	}

	@When("^I add (\\d+) and (\\d+)$")
	public void i_add_and(int arg1, int arg2) throws Throwable {
		
		System.out.println("Added values "+arg1+" "+arg2);
	   
	}

	@Then("^I get the result as  (\\d+)$")
	public void i_get_the_result_as(int arg3) throws Throwable {
		System.out.println("Result is:"+arg3);
	}
}
