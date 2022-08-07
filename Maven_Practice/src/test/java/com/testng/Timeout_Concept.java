package com.testng;

import org.testng.annotations.Test;

public class Timeout_Concept {
	
	@Test(timeOut = 3000)
	public void login() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("Browser Launch");
		
		Thread.sleep(1000);
		System.out.println("Url Launch");
		
		Thread.sleep(2000);
		System.out.println("login");

	}

}
