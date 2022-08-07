package com.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gopi\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.navigate().to("https://www.instagram.com/");

		driver.navigate().back();

		driver.navigate().forward();

		String title = driver.getTitle();

		System.out.println(title);

		String CU = driver.getCurrentUrl();

		System.out.println(CU);

		driver.navigate().refresh();

//		driver.close();

//		driver.quit();

	}

}
