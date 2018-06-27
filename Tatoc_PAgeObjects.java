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
	Frame_Dungeon f;
	Drag_Box d;
	Popup_Window p;
	Token_Generator t;
	
	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Desktop/chromedriver");
		driver = new ChromeDriver();
		l = new Launching_Url(driver);
		s= new Select_Basic_Course(driver);
		g= new Grid_Gate(driver);
		f= new Frame_Dungeon(driver);
		d= new Drag_Box(driver);
		p=new Popup_Window(driver);
		t= new Token_Generator(driver);
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
	public void test1()
	{
		g.grid();
	}
	@Test
	public void test2()
	{
		f.frame_dungeon();
	}
	@Test
	public void test3()
	{d.drag_box();
		
	}
@Test
public void test4()
{
	p.popup_window();
}
@Test
public void test5()
{
	t.token_generator();
}
}
