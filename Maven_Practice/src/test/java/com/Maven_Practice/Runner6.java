package com.Maven_Practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pommanager.PageObjectManager;
import com.properties.Reader_Manager;

public class Runner6 extends BaseClass{
	
	public static WebDriver driver = browserLaunch("chrome");
	
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	public static void main(String[] args) throws IOException {
		
		
		
		launchUrl(Reader_Manager.getInstanceRm().getInstanceCr().getUrl());
		
		
		
		passInput(pom.getInstanceLogin().getUsername(), Reader_Manager.getInstanceRm().getInstanceCr().getUsername());
		
		passInput(pom.getInstanceLogin().getPass(), Reader_Manager.getInstanceRm().getInstanceCr().getPassword());
		
		clickbtn(pom.getInstanceLogin().getBtn());
		
		
		
		selectOption(pom.getinstanceHp().getLoc(), "Brisbane");
		
		selectOption(pom.getinstanceHp().getHotel(), "Hotel Sunshine");
		
		selectOption(pom.getinstanceHp().getRoomtype(),"Double");
		
		selectOption(pom.getinstanceHp().getRoomnum(), "4");
		
		clearElement(pom.getinstanceHp().getDatep());
		passInput(pom.getinstanceHp().getDatep(), "15/06/2022");
		
		clearElement(pom.getinstanceHp().getDateo());
		passInput(pom.getinstanceHp().getDateo(), "17/06/2022");
		
		selectOption(pom.getinstanceHp().getAdultroom(), "2");
		
		selectOption(pom.getinstanceHp().getChild_room(), "2");
		
		clickbtn(pom.getinstanceHp().getSubmit());
		
		
		
		
	}
	
	
	

}
