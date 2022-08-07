package com.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsPractice {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gopi\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		driver.navigate().to("http://www.amazon.com/");

		driver.navigate().back();

		driver.navigate().forward();

		String title = driver.getTitle();

		System.out.println(title);

		String cu = driver.getCurrentUrl();

		System.out.println(cu);

		driver.navigate().refresh();

		driver.quit();

	}

}
