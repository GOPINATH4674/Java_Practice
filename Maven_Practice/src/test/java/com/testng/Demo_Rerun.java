package com.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Demo_Rerun implements IRetryAnalyzer{

	int start = 0;
	int end = 2;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if (start<end) {
			
			start++; 
			return true;
			
		}

		
		return false;
	}

}
