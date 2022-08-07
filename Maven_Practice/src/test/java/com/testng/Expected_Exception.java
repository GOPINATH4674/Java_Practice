package com.testng;

import org.testng.annotations.Test;

public class Expected_Exception {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public  void add() {
		
		int a = 10;
		
		System.out.println(a/0);

	}
	
	
	
}
