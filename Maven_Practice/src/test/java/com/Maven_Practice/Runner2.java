package com.Maven_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import compomclass.LoginPage;

public class Runner2 extends BaseClass{
	
	public static void main(String[] args) {
		
		browserLaunch("chrome");

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\gopi\\eclipse-workspace\\Maven_Practice\\Drivers\\chromedriver.exe");
//		
//	    WebDriver driver = new ChromeDriver();
		
//	    driver.manage().window().maximize();
		
		launchUrl("http://adactinhotelapp.com/");
	
//	    driver.get("http://adactinhotelapp.com/");
//	    
	    
	    WebElement username = driver.findElement(By.id("username"));
	    
//	    username.sendKeys("GOPI4674");
	    passInput(username, "GOPI4674");
	    
	    WebElement pass = driver.findElement(By.id("password"));
	    
//	    pass.sendKeys("Gopi@4674");
	    passInput(pass, "Gopi@4674");
	    
	    WebElement login = driver.findElement(By.id("login"));
	    
//	    login.click();
	    clickbtn(login);
	    
	    
	    
	    

	}
	
	

}

