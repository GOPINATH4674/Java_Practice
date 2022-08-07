package com.Maven_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;

import compomclass.LoginPage;
import compomclass.SelectHotelPage;

public class Runner4 extends BaseClass{
	
	public static WebDriver driver = browserLaunch("chrome");
	
	public static LoginPage lp = new LoginPage(driver);
	
	public static SelectHotelPage hp = new SelectHotelPage(driver);
	
	public static void main(String[] args) {
		
		
		
		launchUrl("http://adactinhotelapp.com/");
		
		
		
		passInput(lp.getUsername(), "GOPI4674");
		
		passInput(lp.getPass(), "Gopi@4674");
		
		clickbtn(lp.getBtn());
		
		
		
		selectOption(hp.getLoc(), "Brisbane");
		
		selectOption(hp.getHotel(), "Hotel Sunshine");
		
		selectOption(hp.getRoomtype(),"Double");
		
		selectOption(hp.getRoomnum(), "4");
		
		clearElement(hp.getDatep());
		passInput(hp.getDatep(), "15/06/2022");
		
		clearElement(hp.getDateo());
		passInput(hp.getDateo(), "17/06/2022");
		
		selectOption(hp.getAdultroom(), "2");
		
		selectOption(hp.getChild_room(), "2");
		
		clickbtn(hp.getSubmit());
		
		
		
		
	}

}
