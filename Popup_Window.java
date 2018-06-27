package com.qait.automation.Tatoc_With_PageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Popup_Window {
	WebDriver driver;

	public Popup_Window(WebDriver driver) {
this.driver=driver;
	}
public void popup_window() 
{
driver.findElement(By.linkText("Launch Popup Window")).click();	
String Parent_Window= driver.getWindowHandle();
String Sub_Window=null;
Set<String > windows= driver.getWindowHandles();
Iterator itr= windows.iterator();
while(itr.hasNext())
{
	Sub_Window=(String) itr.next();
}
driver.switchTo().window(Sub_Window);
driver.findElement(By.id("name")).sendKeys("BHUMIKA");
driver.findElement(By.id("submit")).click();
driver.switchTo().window(Parent_Window);
driver.findElement(By.linkText("Proceed")).click();
}
}
