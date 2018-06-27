package com.qait.automation.Tatoc_With_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.JavascriptExecutor;


public class Drag_Box {
WebDriver driver;
	public Drag_Box(WebDriver driver) {
this.driver=driver;
	}
	public void drag_box()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement dragbox= driver.findElement(By.id("dragbox"));
		((RemoteWebDriver) js).executeScript("arguments[0].setAttribute('style','position: relative; left: 30px; top: -71px;')", dragbox);
		driver.findElement(By.linkText("Proceed")).click();
		
	}
}
