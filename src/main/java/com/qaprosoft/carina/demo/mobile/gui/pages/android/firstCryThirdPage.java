package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.firstCryDatePage;

public class firstCryThirdPage extends firstCryDatePage{
	
	
	public firstCryThirdPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath="//android.widget.TextView[@text='Date Of Birth']")
	private ExtendedWebElement birth;
	
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	private ExtendedWebElement ok;
	
	
	@Override
	public void dateclick()
	{
		birth.click();
		ok.click();
	}
	
		

}
