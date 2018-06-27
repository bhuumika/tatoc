package com.qait.automation.Tatoc_With_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Grid_Gate {
	WebDriver driver;
	public Grid_Gate(WebDriver driver) {
		this.driver=driver;
	
	}
	public void grid()
	{		
		driver.findElement(By.className("greenbox")).click();
	
	}
	

}
