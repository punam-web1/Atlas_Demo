package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MobileSalesLoginPageBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class HDFC_MobileSalesDemo extends AbstractTest {
	
	public void setCustCaps(String jenkinsJobEnvironment) throws Exception{
		String propFile = propertiesFile(jenkinsJobEnvironment);
		
		String path = "src/main/resources/m1Cloud/android/"+jenkinsJobEnvironment;
		Properties prop = new Properties();
		InputStream input = new FileInputStream(path);
		prop.load(input);
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("Capability_Username",prop.getProperty("Capability_Username"));
		capabilities.setCapability("Capability_ApiKey",prop.getProperty("Capability_ApiKey"));
		capabilities.setCapability("Capability_ApplicationName", prop.getProperty("Capability_ApplicationName"));
		capabilities.setCapability("Capability_DurationInMinutes", prop.getProperty("Capability_DurationInMinutes"));
		capabilities.setCapability("Capability_DeviceFullName",prop.getProperty("Capability_DeviceFullName"));
		capabilities.setCapability("deviceType",prop.getProperty("deviceType"));
		capabilities.setCapability("platformName",prop.getProperty("platformName"));
		capabilities.setCapability("automationName",prop.getProperty("automationName"));
		capabilities.setCapability("appActivity",prop.getProperty("appActivity"));
		capabilities.setCapability("appPackage",prop.getProperty("appPackage"));
		capabilities.setCapability("autoGrantPermissions", true);
		R.CONFIG.getProperties().setProperty("deviceName", prop.getProperty("Capability_DeviceFullName"));
		
		getDriver("default", capabilities, R.CONFIG.get("selenium_host"));
	}
	
	public String propertiesFile(String jenkinsJobEnvironment){
		System.out.println(System.getProperty("stageName"));
		String propName = null;

		if(jenkinsJobEnvironment.equals("DEV")){
			propName = "Samsung_Galaxy_J5_Prime.properties";
		}
		else if(jenkinsJobEnvironment.equals("QA")){
			propName = "Samsung_Galaxy_J7_Prime.properties";
		}
		else{
			propName = "OnePlus7.properties";
		}
		return propName;
	}
	
    @Test(testName="testMobileSalesDiary")
    @Parameters(value={"deviceName"})
    public void testMobileSalesDiary(String deviceName) throws Exception {
    	setCustCaps(deviceName);
    	MobileSalesLoginPageBase mobileD = initPage(getDriver(), MobileSalesLoginPageBase.class);
    	mobileD.login("12306","Hdfc@123");
    	mobileD.homePage();
    	mobileD.logout();
    }

    private void setApplicationPath() {
		String pathToApp;
		String iosPath = "src/main/resources/carinademoexample.zip";
		String androidPath = "src/main/resources/MobileSalesDairy.apk";
		if (Type.ANDROID_PHONE.getFamily().equalsIgnoreCase(R.CONFIG.get("capabilities.platformName")))
			pathToApp = androidPath;
		else 
			pathToApp = iosPath;
		File file = new File(pathToApp);
		Configuration.setMobileApp(file.getAbsolutePath());
	}
}
