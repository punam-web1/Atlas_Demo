package com.qaprosoft.carina.demo.cucumber.steps;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qaprosoft.carina.demo.gui.pages.workline_Pages;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.worklinePageBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class WorklineHrLogin extends CucumberRunner{
	WebDriver driver;
	worklinePageBase user=null;
	
/*	@Given("a web browser on the Google page and we search the given url for workline")
	public void a_web_browser_on_the_Google_page_and_we_search_the_given_url_for_workline() {
		driver=HelperFunctions.createAppropriateDriver("chrome");
		driver.get("https://qktpl.workline.hr/");
   
	}

	@When("we enter {string} and {string}")
	public void we_enter_and(String string, String string2) {
		By click1 = By.xpath("//*[@id='musername']");
		WebElement element = driver.findElement(click1);
		element.sendKeys(string);
		By click2 = By.xpath("//*[@id='mpassword']");
		WebElement element1 = driver.findElement(click2);
		element1.sendKeys(string2);
	    }

	@When("click on login button")
	public void click_on_login_button() {
		By click3 = By.xpath("//*[@id='login']");
		WebElement element2 = driver.findElement(click3);
		element2.click();
		 }

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
		System.out.println("Sucessfully logied in");
	    }*/
	
	@Given("^a web browser on the Google page and we search the given url for workline$")
	public void a_web_browser_on_the_Google_page_and_we_search_the_given_url_for_workline() throws Throwable {
		///System.setProperty("webdriver.chrome.driver","D:\\Selenium_Web_Driver\\01\\src\\driver\\chromedriver.exe");
		// driver = new ChromeDriver();
		//driver.get("https://qktpl.workline.hr/");
		user = initPage(getDriver(), worklinePageBase.class);
		
		
   }

	@When("^we enter username and password$")
	public void we_enter_username_and_password()  {
		
		user.username("Q6151");
		user.password("Poonam@2018");
		
		}
	@When("^click on login button$")
	public void click_on_login_button() {
		user.login();
		
		}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		System.out.println("Sucessfully logied in");
	    }




}
