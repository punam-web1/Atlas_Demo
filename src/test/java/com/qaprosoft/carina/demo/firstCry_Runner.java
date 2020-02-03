package com.qaprosoft.carina.demo;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberBaseTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.demo.utils.M1CloudActivities;

import cucumber.api.CucumberOptions;
@CucumberOptions(features = "src/test/resources/features/FirstCry.feature",
glue = "com.qaprosoft.carina.demo.cucumber.steps",
		format={"pretty",
        "html:target/cucumber-core-test-report",
        "pretty:target/cucumber-core-test-report.txt",
        "json:target/cucumber-core-test-report.json",
        "junit:target/cucumber-core-test-report.xml"}
)

public class firstCry_Runner extends CucumberBaseTest {
	
		}