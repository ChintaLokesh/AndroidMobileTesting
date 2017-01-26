package com.testScripts;


import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SampleCalc {
	//static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		   
			//File f=new File("D:\\AndriodMobileTesting\\APKFiles\\Calculator_com.android.calculator2.apk");
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(CapabilityType.BROWSER_NAME, "Android");
			cap.setCapability("deviceName", "Andriod");
			cap.setCapability("platformName", "Andriod");
			cap.setCapability(CapabilityType.VERSION, "6.0");
			cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
			//cap.setCapability("f",f.getAbsolutePath() );
			cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
	      	AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap); 
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	
	    	 WebElement two=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02"));
	    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         two.click();

	        driver.quit();

	}

}
