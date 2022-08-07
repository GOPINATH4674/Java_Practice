package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Concept {
	
	@Test(dataProvider = "input")
	public void credential(String username, String password) {
		
		System.out.println("Usernam is :" +username);
		System.out.println("Password is :"+ password);

	}
	
	@DataProvider
	public Object[][] input() {
		
		
		
		return new Object [][] {
			
			{"Gopi", "123"},
			{"Master", "456"},
			{"Beast" , "789"}

	
	};
}
}