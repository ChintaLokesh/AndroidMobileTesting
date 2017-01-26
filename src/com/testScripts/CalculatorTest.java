package com.testScripts;


import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;
import com.utils.BaseClass;

public class CalculatorTest extends BaseClass {
	
	@Test
	public static void main() throws Exception {
		
		
		Logger logger=Logger.getLogger(CalculatorTest.class);
		//DOMConfigurator.configure("log4j.properties");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Application is launched Successfully");
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Waiting for the application to be ready");
		androidDriver.findElementById("com.sec.android.app.popupcalculator:id/bt_02").click();
		androidDriver.findElementById("com.sec.android.app.popupcalculator:id/bt_add").click();
		androidDriver.findElementById("com.sec.android.app.popupcalculator:id/bt_05").click();
		androidDriver.findElementById("com.sec.android.app.popupcalculator:id/bt_equal").click();
		String name=androidDriver.findElementById("com.sec.android.app.popupcalculator:id/txtCalc").getText().toString();
		logger.info("Result of the test is "+name);
		System.out.println("result is "+name);
		
	//	androidDriver.quit();
	}

}
