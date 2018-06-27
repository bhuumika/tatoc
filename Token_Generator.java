package com.qait.automation.Tatoc_With_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class Token_Generator {
WebDriver driver;
	public Token_Generator(WebDriver driver) {
		this.driver=driver;
	}
	public void token_generator()

	{
		driver.findElement(By.linkText("Generate Token")).click();
	String Token_Text=	driver.findElement(By.id("token")).getText();
	String token= Token_Text.substring(Token_Text.indexOf(":")+2);
	Cookie cookie= new Cookie("Token",token);
	driver.manage().addCookie(cookie);
	driver.findElement(By.linkText("Proceed")).click();
	}
}
