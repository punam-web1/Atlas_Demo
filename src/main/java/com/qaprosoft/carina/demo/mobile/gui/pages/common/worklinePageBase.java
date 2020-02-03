package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public  abstract class worklinePageBase extends AbstractPage {

	public worklinePageBase(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public abstract void username(String name);
	public abstract void password(String name);
	public abstract void login();
	

	
	
}


