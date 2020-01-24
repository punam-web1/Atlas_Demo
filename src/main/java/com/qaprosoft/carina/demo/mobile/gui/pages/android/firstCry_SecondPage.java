package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.firstCry_YearPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.firstcry_firstFlow_Base;

public class firstCry_SecondPage extends firstCry_YearPage {
	
	public firstCry_SecondPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//android.widget.TextView[@text='2 - 4 Years']")
	private ExtendedWebElement year;
	
	@Override
	public void yearClick()
	{
		year.click();
		}

	

	
}
