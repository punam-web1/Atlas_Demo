package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.firstCryFourthPageBase;

public abstract class firstCryFourthPage extends firstCryFourthPageBase{
	
	public firstCryFourthPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Child Name']")
	private ExtendedWebElement name;
	
	@FindBy(xpath="//android.widget.TextView[@text='SUBMIT']")
	private ExtendedWebElement submit;
	 
	@Override
	public void nameclick(String p)
	{
		name.type("ABC");
		submit.click();
	}
	
	

}
