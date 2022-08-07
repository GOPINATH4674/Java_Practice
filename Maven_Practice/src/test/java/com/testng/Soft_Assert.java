package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	@Test
	public void demo() {
		
		String exp = "Gopi";
		String act = "gopi";
		
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(act, exp);
		
		System.out.println("Validation");

	}

}
