package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Concept {
	
	
	@Test
	public void demo() {
		
		String exp = "Gopi";
		
		String act = "Gopi";
		
		Assert.assertEquals(act, exp);
		
		System.out.println("Validation");

	}
	

}
