package com.qaprosoft.carina.demo.cucumber.steps;

import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.eguru_Create_Account_Base;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.firstcry_firstFlow_Base;

import cucumber.api.java.en.Given;

public class eguru_Create_Account_Step_def extends CucumberRunner {
	eguru_Create_Account_Base user=null;
	@Given("^launch mobile application$")
	public void eguru_Create_Account_Step_def() throws Exception {
		user = initPage(getDriver(), eguru_Create_Account_Base.class);
		user.Click();
		user.Click();
		user.Click();
		user.Click();
		
		try {
		user.userId();
		}
		catch(WebDriverException e)
		{
			e.printStackTrace();
		}
		
		
		try {
			user.password();
			}
			catch(WebDriverException e)
			{
				e.printStackTrace();
			}
		
		
		try {
			user.login();
			}
			catch(WebDriverException e)
			{
				e.printStackTrace();
			}
		
		
	}
	
	
	
	
 
}
