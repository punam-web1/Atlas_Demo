package com.qaprosoft.carina.demo.cucumber.steps;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.QtracHomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.QtracLoginPageBase;
import com.qaprosoft.carina.demo.utils.M1CloudActivities;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QtracStepdef extends CucumberRunner {

	QtracLoginPageBase Login = null;
	QtracHomePageBase Home = null;

	@Given("^Open the browser and launch the application$")
	public void LoginPage() throws Exception {
		System.out.println("Appliction launched");
		M1CloudActivities mobile = new M1CloudActivities();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities = mobile.setCapabilities("Samsung_Galaxy_J7_Prime.properties");
		//getDriver("DEFAULT", capabilities, R.CONFIG.get("selenium_host"));
		Login = initPage(getDriver("DEFAULT", capabilities, R.CONFIG.get("selenium_host")), QtracLoginPageBase.class);
	}

	@When("^Enter Username and Password$")
	public void enterdetails() {
		System.out.println("test start");
		Login.clickonSignin();
		Login.login("testqk", "Quality@123");
	}

	@Then("^click on login$")
	public void ClickOnLoginBtn() {
		Login.clickonLoginBtn();
	}

	@And("^click on speedometer dashboard$")
	public void clickonspeedometerdashboard() {
		Home = initPage(Login.getDriver(), QtracHomePageBase.class);
		Home.clickSpeedometerDashbord();
	}

	@And("^click on Pagebucket dashboard$")
	public void clickonPagebucketdashboard() {
		Home.clickPageBucketDashborad();
	}

}
