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

public class ScreenshotPractice {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gopi\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));

		email.sendKeys("9941717983");

		WebElement ps = driver.findElement(By.xpath("//input[@name='pass']"));

		ps.sendKeys("Gopi@4674");

		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));

		btn.click();

		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File des = new File("C:\\Users\\DELL\\SeleniumTraing" + "\\SeleniumTraining\\Sreenshot\\pic1.png");
		FileHandler.copy(source, des);

	}

}
