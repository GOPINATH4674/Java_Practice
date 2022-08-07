package com.testng;

import org.testng.annotations.Test;

public class Grouping_Concept {
	
	@Test(groups = "Fruits")
	public void apple() {
		
		System.out.println("Apple");

	}
	
	@Test(groups = "Fruits")
	public void banana() {
		
		System.out.println("Banana");

	}
	@Test(groups = "Fruits")
	public void orange() {
		
		System.out.println("Orange");

	}
	

	@Test(groups = "Vege")
	public void beans() {
		
		System.out.println("beans");

	}
	
	@Test(groups = "Vege")
	public void carrot() {
		
		System.out.println("Carrot");
		
		

	}
	
	@Test(groups = "Chocky")
	public void fiveStar() {
		
		System.out.println("FiveStar");

	}
	
	@Test(groups = "Chocky")
	public void milkyBar() {
		
		System.out.println("MilkyBar");

	}

}
