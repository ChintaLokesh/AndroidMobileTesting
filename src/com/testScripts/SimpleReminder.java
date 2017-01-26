package com.testScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SimpleReminder {

	public static void main(String args[]) throws MalformedURLException
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("deviceName", "Andriod");
		caps.setCapability("platformName", "Andriod");
		caps.setCapability(CapabilityType.VERSION, "6.0.0");
		caps.setCapability("appPackage", "com.gadgetjudge.simplestreminder");
		caps.setCapability("appActivity", "com.gadgetjudge.simplestreminder..NewReminderActivity");
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.quit();
	}
}
