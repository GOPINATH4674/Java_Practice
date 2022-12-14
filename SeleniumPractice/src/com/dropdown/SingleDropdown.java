package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gopi\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement btn = driver.findElement(By.xpath("//a[text()='Create New Account']"));

		btn.click();

		Thread.sleep(5000);

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

		Select s1 = new Select(day);

		s1.selectByValue("12");

		boolean check = s1.isMultiple();

		System.out.println(check);

		System.out.println("...................................................");

		List<WebElement> list1 = s1.getOptions();

		for (WebElement it : list1) {

			String text = it.getText();

			System.out.println(text);

		}

		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));

		Select s2 = new Select(month);

		s2.selectByVisibleText("Dec");

		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

		Select s3 = new Select(year);

		s3.selectByVisibleText("1991");

	}

}
