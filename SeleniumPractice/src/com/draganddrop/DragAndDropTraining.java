package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTraining {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gopi\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		driver.manage().window().maximize();

		WebElement fromr = driver.findElement(By.id("box6"));
		WebElement toi = driver.findElement(By.id("box106"));

		Actions act = new Actions(driver);

		act.dragAndDrop(fromr, toi).build().perform();

		WebElement fromo = driver.findElement(By.id("box1"));
		WebElement ton = driver.findElement(By.id("box101"));
		act.dragAndDrop(fromo, ton).build().perform();

		WebElement froms = driver.findElement(By.id("box5"));
		WebElement tok = driver.findElement(By.id("box105"));
		act.dragAndDrop(froms, tok).build().perform();

		WebElement fromw = driver.findElement(By.id("box3"));
		WebElement tous = driver.findElement(By.id("box103"));
		act.dragAndDrop(fromw, tous).build().perform();

		WebElement fromm = driver.findElement(By.id("box7"));
		WebElement tosp = driver.findElement(By.id("box107"));
		act.dragAndDrop(fromm, tosp).build().perform();

		WebElement fromco = driver.findElement(By.id("box4"));
		WebElement toden = driver.findElement(By.id("box104"));
		act.dragAndDrop(fromco, toden).build().perform();

		WebElement fromst = driver.findElement(By.id("box2"));
		WebElement tosw = driver.findElement(By.id("box102"));
		act.dragAndDrop(fromst, tosw).build().perform();

	}

}
