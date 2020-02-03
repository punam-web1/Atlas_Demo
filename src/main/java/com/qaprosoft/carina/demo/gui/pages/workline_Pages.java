package com.qaprosoft.carina.demo.gui.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.worklinePageBase;

public class workline_Pages extends worklinePageBase {
	public workline_Pages(WebDriver driver) {
		super(driver);
		
	}

	Logger LOGGER = Logger.getLogger(workline_Pages.class);

	@FindBy(xpath = "//*[@id='musername']")
	private ExtendedWebElement username1;

	@FindBy(xpath = "//*[@id='mpassword']")
	private ExtendedWebElement password1;

	@FindBy(xpath = "//*[@id='login']")
	private ExtendedWebElement login1;

	@Override
	public void username(String name) {
		username1.type(name);
	}

	@Override
	public void password(String pass) {
		password1.type(pass);

	}

	@Override
	public void login() {
		login1.click();
	}


}
