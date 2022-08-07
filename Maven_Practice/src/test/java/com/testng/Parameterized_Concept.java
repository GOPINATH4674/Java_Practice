package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
	
	@Test
	@Parameters({"username" , "password"})
	public void credential(String username, String password) {
		
		System.out.println("Usernam is :" +username);
		System.out.println("Password is :"+ password);

	}

	// Convert Xml
}
