package com.conference.ConfrenceTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(format= {"pretty","html:target/reports"})
public class JUnitRunner {

}
