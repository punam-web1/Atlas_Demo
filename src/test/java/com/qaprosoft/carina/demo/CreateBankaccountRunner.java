package com.qaprosoft.carina.demo;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberBaseTest;

import cucumber.api.CucumberOptions;
@CucumberOptions(features = "src/test/resources/features/My_API_Test.feature",
glue = "com.qaprosoft.carina.demo.cucumber.steps",
format={"pretty",
        "html:target/cucumber-core-test-report",
        "pretty:target/cucumber-core-test-report.txt",
        "json:target/cucumber-core-test-report.json",
        "junit:target/cucumber-core-test-report.xml"}
//,plugin = "json:target/cucumber1.json"
)


public class CreateBankaccountRunner extends CucumberBaseTest {
 
  
}
