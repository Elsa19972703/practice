package com.capg.ConferenceRoom.test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features"},
		glue= {"com.capg.ConferenceRoom.StepDefinition"},
		tags= {"@executeconf"}
	)
public class ConferenceRoomBookingTest {

}
