package com.animalfinder.enterpriseproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitAnnotationExamples {

	
	
	
	@Test
	public void runTests() {
		int i =1+1;
		assertEquals(2,i);
	}
	@Test 
	public void runMoreTests() {
	int i = 1+1;
	assertEquals(2, i);
	
	}
	
	
}
