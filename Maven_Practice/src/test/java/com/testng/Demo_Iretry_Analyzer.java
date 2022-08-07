package com.testng;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Iretry_Analyzer {
	@Test
	public void username() {
		
		String exp = "Gopi4674";
		String act = "Gopi4674";
		
		Assert.assertEquals(act, exp);

	}
	
	@Test(retryAnalyzer = Demo_Rerun.class)
	public void password() {
		
		String exp = "1234";
		String act = "1254";
		
		Assert.assertEquals(act, exp);

	}

}
