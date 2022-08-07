package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotPractice1 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gopi\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));

		email.sendKeys("gogopi@gmail.com");

		WebElement ps = driver.findElement(By.xpath("//input[@name='pass']"));

		ps.sendKeys("qwertyui");

		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));

		btn.click();

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File des = new File("C:\\Users\\DELL\\SeleniumTraing\\SeleniumTraining\\Sreenshot\\pic.png");

		FileHandler.copy(source, des);

	}

}

