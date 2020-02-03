package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.QtracLoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.firstcry_firstFlow_Base;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = firstcry_firstFlow_Base.class)

public class firstCry_Firstflow extends firstcry_firstFlow_Base {
	//@FindBy(xpath="//*[@text='All']")
	//private ExtendedWebElement all;

	//*[@text='menu']"
	//android.widget.TextView
	@FindBy(xpath="//android.widget.TextView[@text='Boy']")
	private ExtendedWebElement boy;
	
	
		
	public firstCry_Firstflow(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void BoyClick()
	{
		boy.click();
	}
	
		
	}
 

