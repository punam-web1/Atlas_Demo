package com.qaprosoft.carina.demo;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberBaseTest;

import cucumber.api.CucumberOptions;
@CucumberOptions(features = "RedBus.feature",
glue = "com.qaprosoft.carina.demo.cucumber.steps",
		format={"pretty",
        "html:target/cucumber-core-test-report",
        "pretty:target/cucumber-core-test-report.txt",
        "json:target/cucumber-core-test-report.json",
        "junit:target/cucumber-core-test-report.xml"}
)

public class RedBus_Runner extends CucumberBaseTest {
	

	
  
}
