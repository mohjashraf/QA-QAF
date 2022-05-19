package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features = "Feature",
		glue = "com.stepdefination",
		tags = "@amazon"
		
		)

public class testrunner extends AbstractTestNGCucumberTests {

}
