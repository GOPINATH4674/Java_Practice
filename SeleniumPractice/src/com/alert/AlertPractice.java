package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gopi\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();

		Thread.sleep(2000);

		Alert a1 = driver.switchTo().alert();

		a1.accept();

		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();

		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();

		Thread.sleep(3000);

		Alert a2 = driver.switchTo().alert();

		a2.dismiss();

		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();

		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();

		Alert a3 = driver.switchTo().alert();

//		a3.accept();

		String te = a3.getText();

		System.out.println(te);
	}

}
