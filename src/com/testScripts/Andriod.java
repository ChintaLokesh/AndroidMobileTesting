package com.testScripts;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Andriod {
  @Test
  public void f() throws MalformedURLException {
	  System.out.println("hello------");
	  DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("deviceName", "Le 1s");
		caps.setCapability(CapabilityType.BROWSER_NAME, "Andriod");
		caps.setCapability("appPackage", "com.android.calculator2");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		caps.setCapability("appWaitActivity", "com.android.calculator2.Calculator");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "5.0.2");
		io.appium.java_client.android.AndroidDriver<MobileElement> driver= new io.appium.java_client.android.AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4724/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("2")).click();
		driver.findElement(By.name("+")).click();
		driver.findElement(By.name("5")).click();
		driver.findElement(By.name("=")).click();
		String result=driver.findElement(By.className("android.widget.EditText")).getText();
		System.out.println("result is"+result);
		driver.quit();
  }
}
