package com.qait.automation.Tatoc_With_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tatoc_PAgeObjects {

	WebDriver driver;
	Launching_Url l;
	Select_Basic_Course s;
	Grid_Gate g;
	
	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Desktop/chromedriver");
		driver = new ChromeDriver();
		l = new Launching_Url(driver);
		s= new Select_Basic_Course(driver);
		g= new Grid_Gate(driver);
	}

	@Test
	public void launch_url() {
		l.launch_The_Tatoc();
	}

	@Test
	public void select_Basic_Course()

	{
		s.basic_Course();
	}
	@Test
	public void gridGAte()
	{
		g.grid();
	}

}
