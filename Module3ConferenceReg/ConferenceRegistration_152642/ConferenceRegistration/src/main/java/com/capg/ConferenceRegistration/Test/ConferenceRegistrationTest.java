package com.capg.ConferenceRegistration.Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format= {"pretty","html:target/reports"},
		features= {"features"},
		glue= {"com.capg.ConferenceRegistration.StepDefinition"},
		tags= {"@executeregistration"}
	)

public class ConferenceRegistrationTest {

}
