package com.scrollupscrolldown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupAndScrolldown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gopi\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

//		javascriptExecuter

		JavascriptExecutor jc = (JavascriptExecutor) driver;

		jc.executeScript("window.scrollBy(0,2550)", "");

		Thread.sleep(5000); // interrupted exception throw pannum.

		jc.executeScript("window.scrollBy(0, -2550)", "");

		WebElement bottom = driver.findElement(By.xpath("//a[text()='Japan']"));
		jc.executeScript("arguments[0].scrollIntoView()", bottom);

	}

}
