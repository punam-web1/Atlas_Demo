package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.eguru_Create_Account_Base;
@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = eguru_Create_Account_Base.class)


public   class eguru_Create_Account_page extends eguru_Create_Account_Base{

	public eguru_Create_Account_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//android.widget.Button[@text='DENY']")
	private ExtendedWebElement click1;
	
	@FindBy(xpath="//android.widget.Button[@text='ALLOW']")
	private ExtendedWebElement click2;
	
	@FindBy(id="com.tatamotors.eguruhybrid:id/user_id")
	private ExtendedWebElement userid3;
	@FindBy(xpath="//android.widget.TextView[@text='PV10_SPMA']")
	private ExtendedWebElement userid2;
	
	
	@FindBy(xpath="com.tatamotors.eguruhybrid:id/password")
	private ExtendedWebElement password1;

	@FindBy(xpath="//android.widget.Button[@text='LOGIN']")
	private ExtendedWebElement login1;
	
	
	@Override
	public void Click()
	{
		click2.click();
	}
	@Override
	public void userId()
	{
		userid3.click();
		userid3.click();
		
		
	}

	@Override
	public void password()
	{
		password1.click();
	}
	@Override
	public void login()
	{
		login1.click();
	}
	
}
