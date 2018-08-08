package com.capg.ConferenceRegistration.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.capg.ConferenceRegistration.Bean.ConferenceRegistrationPageBean;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConferenceRegistrationStepDefinition {

	static WebDriver driver;
	private ConferenceRegistrationPageBean pageBean;

	@Before
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "D:\\srinivas\\selenium\\chromedriver.exe");
	}

	// CONFERENCE REGISTRATION---------------------------------------------------------------------

	@Given("^User is on Conference room booking page$")
	public void user_is_on_Conference_room_booking_page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("file:///D:/Kavya_BDDExercises/ConferenceRegistration/ConferenceRegistartion.html");
		driver.manage().window().maximize();
		pageBean = new ConferenceRegistrationPageBean();
		PageFactory.initElements(driver, pageBean);
	}

	@When("^User select 'Next' link without entering 'FirstName'$")
	public void user_select_Next_link_without_entering_FirstName() throws Throwable {
		pageBean.clickNextPageLink();
	}

	@Then("^'Please fill the First Name' message should display$")
	public void please_fill_the_First_Name_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please fill the First Name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without entering 'LastName'$")
	public void user_select_Next_link_without_entering_LastName() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setFirstName("Kavya");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please fill the Last Name' message should display$")
	public void please_fill_the_Last_Name_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please fill the Last Name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without entering 'Email'$")
	public void user_select_Next_link_without_entering_Email() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setLastName("Kilari");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please fill the Email' message should display$")
	public void please_fill_the_Email_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please fill the Email";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without entering 'Contact No'$")
	public void user_select_Next_link_without_entering_Contact_No() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setEmail("kavya.kilari@capgemini.com");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please fill the Contact No.' message should display$")
	public void please_fill_the_Contact_No_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please fill the Contact No.";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without selecting  'Number of people attending'$")
	public void user_select_Next_link_without_selecting_Number_of_people_attending() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setContactNo("8008568157");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please fill the Number of people attending' message should display$")
	public void please_fill_the_Number_of_people_attending_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please fill the Number of people attending";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without entereing  'Building Name & Room No'$")
	public void user_select_Next_link_without_entereing_Building_Name_Room_No() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setNoOfPerson("2");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please fill the Building & Room No' message should display$")
	public void please_fill_the_Building_Room_No_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please fill the Building & Room No";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without entereing  'Area Name'$")
	public void user_select_Next_link_without_entereing_Area_Name() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setBuildingAndRoomNo("HI Vega Building, Nanakramguda");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please fill the Area name' message should display$")
	public void please_fill_the_Area_name_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please fill the Area name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without selecting  'City'$")
	public void user_select_Next_link_without_selecting_City() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setAreaName("Gachibowli");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please select city' message should display$")
	public void please_select_city_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please select city";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without selecting  'State'$")
	public void user_select_Next_link_without_selecting_State() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setCity("Hyderabad");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please select state' message should display$")
	public void please_select_state_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please select state";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without selecting  'MemeberShip Status'$")
	public void user_select_Next_link_without_selecting_MemberShip_Status() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setState("Telangana");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please Select MemeberShip status' message should display$")
	public void please_Select_MemeberShip_status_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please Select MemeberShip status";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link after entering Valid set of information$")
	public void user_select_Next_link_after_entering_Valid_set_of_information() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setMemberStatus("member");
		pageBean.clickNextPageLink();
	}
		//Personal Details validated and redirected to next page
	@Then("^'Personal details are validated.' message should display$")
	public void personal_details_are_validated_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Personal details are validated.";
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
	}

	// PAYMENT DETAILS-------------------------------------------------------------------------------

	@When("^User select 'MakePayment' link without selecting  'Card Holder name'$")
	public void user_select_Next_link_without_selecting_Card_Holder_name() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.makePayment();
	}

	@Then("^'Please fill the Card holder name' message should display$")
	public void please_fill_the_Card_holder_name_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please fill the Card holder name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'MakePayment' link without selecting  'Debit Card Number'$")
	public void user_select_Next_link_without_selecting_Debit_Card_Number() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setCardholdername("Kavya");
		pageBean.makePayment();
	}

	@Then("^'Please fill the Debit card Number' message should display$")
	public void please_fill_the_Debit_card_Number_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please fill the Debit card Number";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'MakePayment' link without selecting  'CVV'$")
	public void user_select_MakePayment_link_without_selecting_CVV() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setDebit("234523452345");
		pageBean.makePayment();
	}

	@Then("^'Please fill the CVV' message should display$")
	public void please_fill_the_CVV_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please fill the CVV";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'MakePayment' link without selecting  'expiration month'$")
	public void user_select_Next_link_without_selecting_expiration_month() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setCvv("567");
		pageBean.makePayment();
	}

	@Then("^'Please fill expiration month' message should display$")
	public void please_fill_expiration_month_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please fill expiration month";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'MakePayment' link without selecting  'expiration year'$")
	public void user_select_Next_link_without_selecting_expiration_year() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setMonth("August");
		pageBean.makePayment();
	}

	@Then("^'Please fill the expiration year' message should display$")
	public void please_fill_expiration_year_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Please fill the expiration year";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'MakePayment' link after entering Valid set of information$")
	public void user_select_MakePayment_link_after_entering_Valid_set_of_information() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setYear("2019");
		pageBean.makePayment();
	}
		//Payment success
	@Then("^'Conference Room Booking successfully done!!!' message should display$")
	public void conference_Room_Booking_successfully_done_message_should_display() throws Throwable {
		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage = "Conference Room Booking successfully done!!!";
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
	}

	// window gets closed
	@After
	public void exit() {
		driver.close();
	}
}
