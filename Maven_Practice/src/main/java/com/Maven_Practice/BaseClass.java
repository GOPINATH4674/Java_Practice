package com.Maven_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Return;

public class BaseClass {
	
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {
		
		if (browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
		}

		else if (browsername.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
		}
		
		return driver;
		
	}
	
	public static void launchUrl(String url) {

		driver.get(url);
	}
	
	public static void passInput(WebElement element, String input) {
		
		element.sendKeys(input);
		
	}
	
	public static void clickbtn(WebElement element) {
		
		element.click();

	}
	
	public static void clearElement(WebElement element) {
		
		element.clear();

	}

	public static void selectOption(WebElement element, String input) {
		
		Select s = new Select(element);
		
		s.selectByValue(input);

	}
	
    public static void selectOption(WebElement element, int num) {
		
		Select s = new Select(element);
		
		s.selectByIndex(num);
	
}	

}