package com.qait.automation.Tatoc_With_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Select_Basic_Course {
	WebDriver driver;
	public Select_Basic_Course(WebDriver driver) {
		this.driver=driver;
	}
	public void basic_Course()
	{
		driver.findElement(By.linkText("Basic Course")).click();
	}

	
}
