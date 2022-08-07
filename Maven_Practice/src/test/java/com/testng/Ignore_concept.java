package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_concept {
	
	@Test
	public void apple() {
		
		System.out.println("Apple");

	}
	
	@Test
	public void banana() {
		
		System.out.println("Banana");

	}
	@Test
	public void orange() {
		
		System.out.println("Orange");

	}
	
	@Ignore
	@Test
	public void beans() {
		
		System.out.println("beans");

	}
	
	@Test(enabled = false)
	public void carrot() {
		
		System.out.println("Carrot");

	}
	
	// convert xml (exclude banana(ignore))

}
