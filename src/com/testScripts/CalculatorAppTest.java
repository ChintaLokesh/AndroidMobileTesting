package com.testScripts;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class CalculatorAppTest {

	private static AndroidDriver<?> driver;
	@Test
	public static void main() throws MalformedURLException,InterruptedException 
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME, "");
		caps.setCapability("deviceName", "Andriod");
		caps.setCapability("platformName", "Andriod");
		caps.setCapability("platformVersion", "6.0.0");
		caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		caps.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
		
		driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
