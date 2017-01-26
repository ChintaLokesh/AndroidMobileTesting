package com.utils;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public static AndroidDriver<MobileElement> androidDriver;
	@BeforeClass
	public void configureAndroid() throws Exception
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("deviceName", "Android");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion","6.0.0");
		caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		caps.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		androidDriver=new AndroidDriver<MobileElement>(url,caps);
	}
	@AfterClass
	public void exitBrowser()
	{
		androidDriver.quit();
	}

}
