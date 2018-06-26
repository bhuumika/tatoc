package com.qait.automation.Tatoc_With_PageObjects;

import org.openqa.selenium.WebDriver;

public class Launching_Url {

	WebDriver driver;
	
	public Launching_Url(WebDriver driver) {
	this.driver=driver;
	}
	
public void launch_The_Tatoc()
{
	driver.get("http://10.0.1.86/tatoc");
}
	
}
