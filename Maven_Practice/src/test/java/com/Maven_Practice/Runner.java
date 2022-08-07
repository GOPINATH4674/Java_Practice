package com.Maven_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gopi\\eclipse-workspace\\Maven_Practice\\Drivers\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
		
	    driver.get("http://adactinhotelapp.com/");
	    
	    driver.manage().window().maximize();
	    
	    WebElement username = driver.findElement(By.id("username"));
	    
	    username.sendKeys("GOPI4674");
	    
	    WebElement pass = driver.findElement(By.id("password"));
	    
	    pass.sendKeys("Gopi@4674");
	    
	    WebElement login = driver.findElement(By.id("login"));
	    
	    login.click();
	    
	    
	    
	    

	}
	
	

}
