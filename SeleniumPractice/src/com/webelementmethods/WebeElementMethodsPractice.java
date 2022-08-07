package com.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebeElementMethodsPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gopi\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys("gogopi4674@gmail.com");

		WebElement pass = driver.findElement(By.name("pass"));

		pass.sendKeys("121291");

	}

}
