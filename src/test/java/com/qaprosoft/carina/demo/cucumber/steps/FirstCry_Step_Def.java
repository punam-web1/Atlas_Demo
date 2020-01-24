package com.qaprosoft.carina.demo.cucumber.steps;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.QtracLoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.firstCryDatePage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.firstCryFourthPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.firstCry_YearPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.firstcry_firstFlow_Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstCry_Step_Def extends CucumberRunner {
	firstcry_firstFlow_Base user=null;
	firstCry_YearPage user1=null;
	firstCryDatePage user2=null;
	firstCryFourthPageBase user3=null;
	@Given("^lounch applicationon mobile$")
	public void LoginPage() throws Exception {
		user = initPage(getDriver(), firstcry_firstFlow_Base.class);
		user1 = initPage(getDriver(), firstCry_YearPage.class);
		user2 = initPage(getDriver(), firstCryDatePage.class);
		user3 = initPage(getDriver(), firstCryFourthPageBase.class);
		
	
}
	
	@Then("^click on Boy Button$")
	public void clickboy1()
	{
		System.out.println(" click on Boy button");
		user.BoyClick();
	}
	@Then("^select baby year$")
	public void clickyear()
	{
		user1.yearClick();		
	}
	@Then("^i enter Data of Birth and child name$")
	public void clickBirth1()
	{
	user2.dateclick();
	
	}
	@Then("^click on submit button$")
	public void clickBirth1(String name)
	{
	user3.nameclick("ADV");
	user3.click();
	
	}
	
	
	
	
}
