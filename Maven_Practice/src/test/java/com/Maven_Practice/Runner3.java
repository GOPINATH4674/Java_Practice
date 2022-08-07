package com.Maven_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import compomclass.LoginPage;
import compomclass.SelectHotelPage;

public class Runner3 extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		browserLaunch("chrome");

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\gopi\\eclipse-workspace\\Maven_Practice\\Drivers\\chromedriver.exe");
//		
//	    WebDriver driver = new ChromeDriver();
		
//	    driver.manage().window().maximize();
		
		launchUrl("http://adactinhotelapp.com/");
	
//	    driver.get("http://adactinhotelapp.com/");
//	    
	    LoginPage lp = new LoginPage(driver);
		
//	    WebElement username = driver.findElement(By.id("username"));
	    
//	    username.sendKeys("GOPI4674");
	    passInput(lp.getUsername(), "GOPI4674");
	    
//	    WebElement pass = driver.findElement(By.id("password"));
	    
//	    pass.sendKeys("Gopi@4674");
	    passInput(lp.getPass(), "Gopi@4674");
	    
//	    WebElement login = driver.findElement(By.id("login"));
	    
//	    login.click();
	    clickbtn(lp.getBtn());
	    
	 // select hotel page
	    
		SelectHotelPage shp = new SelectHotelPage(driver);
	    
//		WebElement loc = driver.findElement(By.id("location"));
//		Select s1 = new Select(loc);
//		s1.selectByValue("Brisbane");
		selectOption(shp.getLoc(), "Brisbane");
		
//		WebElement hotels = driver.findElement(By.id("hotels"));
//		Select s2 = new Select(hotels);
//		s2.selectByVisibleText("Hotel Sunshine");
		selectOption(shp.getHotel(), "Hotel Sunshine");
		
//		WebElement rt = driver.findElement(By.id("room_type"));
//		Select s3 = new Select(rt);
//		s3.selectByValue("Double");
		selectOption(shp.getRoomtype(), "Double");
		
		WebElement rnum = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(rnum);
		s4.selectByIndex(4);
		
//		WebElement di = driver.findElement(By.id("datepick_in"));
//		di.clear();
//		clearElement(di);
		clearElement(shp.getDatep());
//		di.sendKeys("15/06/2022");
		passInput(shp.getDatep(), "15/06/2022");
		
//		WebElement dateo = driver.findElement(By.id("datepick_out"));
//		dateo.clear();
		clearElement(shp.getDateo());
//		dateo.sendKeys("17/06/2022");
		passInput(shp.getDateo(), "17/06/2022");
		
//		WebElement adr = driver.findElement(By.id("adult_room"));
//		Select s5 = new Select(adr);
//		s5.selectByValue("2");
		selectOption(shp.getAdultroom(), "2");
		
//		WebElement chrm = driver.findElement(By.id("child_room"));
//		Select s7 =new Select(chrm);
//		s7.selectByValue("2");
		selectOption(shp.getChild_room(), "2");
		
//		WebElement submit = driver.findElement(By.id("Submit"));
//		submit.click();
		clickbtn(shp.getSubmit());
		
//		WebElement Rbtn = driver.findElement(By.id("radiobutton_0"));
//		Rbtn.click();
		clickbtn(shp.getRbtn());
		
//		WebElement ctnu = driver.findElement(By.id("continue"));
//		ctnu.click();
		clickbtn(shp.getCtnu());
		
		
		// book hoel page
		
		WebElement Fname = driver.findElement(By.id("first_name"));
		Fname.sendKeys("Gopinath");
		
		WebElement Lname = driver.findElement(By.id("last_name"));
		Lname.sendKeys("R");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("no jhdsay gkZAyhc nhlkjndcsuy hgsjytgdc hkstuw N");
		
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("758943837498");
		
		WebElement cct = driver.findElement(By.id("cc_type"));
		Select s8 = new Select(cct);
		s8.selectByValue("VISA");
		
		WebElement ccm = driver.findElement(By.id("cc_exp_month"));
		Select s9 = new Select(ccm);
		s9.selectByValue("4");
		
		WebElement ccy = driver.findElement(By.id("cc_exp_year"));
		Select s11 = new Select(ccy);
		s11.selectByValue("2015");
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("456");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\selenium project\\Maven_Project\\Screenshot\\pic.png");
		FileHandler.copy(source, des);
		
	
		
	    
	    
	    

	}
	
	

}

	
	


