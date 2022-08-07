package com.xpath;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gopi\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));

		username.sendKeys("gopi4674@insta");

		WebElement ps = driver.findElement(By.xpath("//input[@name='password']"));

		ps.sendKeys("1234986567");

		WebElement fp = driver.findElement(By.xpath("//a[text()='Forgot password?']"));

		fp.click();

	}

}
