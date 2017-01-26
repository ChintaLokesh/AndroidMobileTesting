package com.objectRepo;

import org.openqa.selenium.WebElement;


import io.appium.java_client.pagefactory.AndroidFindBy;

public class Calc {

	@AndroidFindBy(id="com.sec.android.app.popupcalculator:id/bt_02")
	private WebElement elementTwo;
	
	public WebElement getElementTwo()
	{
		return this.elementTwo;
	}
	
	
}
