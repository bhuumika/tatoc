package com.qait.automation.Tatoc_With_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame_Dungeon {
WebDriver driver;
	public Frame_Dungeon(WebDriver driver) {
		this.driver= driver;
	
	}
	public void frame_dungeon()
	{
		driver.switchTo().frame(0);
		WebElement Box1=driver.findElement(By.id("answer"));
		String Box1_color= Box1.getAttribute("class");
		String Box2_color=" ";
		while(!Box1_color.equals(Box2_color))
		{
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.findElement(By.linkText("Repaint Box 2")).click();
			driver.switchTo().frame(0);
			Box2_color=driver.findElement(By.id("answer")).getAttribute("class");
			
 }
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0).findElement(By.linkText("Proceed")).click();

	}
	

}
