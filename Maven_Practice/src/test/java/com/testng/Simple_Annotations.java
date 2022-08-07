package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	
	
	@BeforeSuite
	public void launchBrowser() {
		
		System.out.println("Launch Browser");

	}
	
	@BeforeClass
	public void urlLaunch() {
		
		System.out.println("Url Launch");

	}
	
	
	@BeforeMethod
	public void login() {
		
		System.out.println("Login");

	}

	@Test(priority = -1)
	public void women() {

		System.out.println("women");

	}

	@Test(invocationCount = 2)
	public void men() {

		System.out.println("men");

	}

	@Test(priority = 1)
	public void kids() {

		System.out.println("kids");

	}
	
	@AfterMethod
	public void logout() {
		
		System.out.println("Logout");

	}
	
	@AfterClass
	public void screenshot() {
		
		System.out.println("Screenshot");

	}
	
	@AfterTest
	public void closeBrowser() {
		
		System.out.println("Close Browser");

	}
	
	@AfterSuite
	public void quitBrowser() {
		
		System.out.println("Quit Browser");

	}

}
