package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFrame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gopi\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Frames.html");

		WebElement single = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));

		driver.switchTo().frame(single);

		WebElement sk = driver.findElement(By.xpath("//input[@type='text']"));

		sk.sendKeys("keysToSend");

		driver.switchTo().defaultContent();

		WebElement btn1 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));

		btn1.click();

		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

		driver.switchTo().frame(outerFrame);

		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));

		driver.switchTo().frame(innerFrame);

		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));

		input.sendKeys("king");

		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		WebElement video = driver.findElement(By.xpath("//a[text() = 'Video']"));

		video.click();

	}

}
