package com.ds.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ds.junitt.MyMath;

class MyMathTest {
	MyMath myMath = new MyMath();
	
	@Test
	
//	void test() {
////		fail("Not yet implemented");
//	}

	public	void submitwith3numbers() {
		
		assertEquals(6,myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	public	void submitwith1numbers() {

		assertEquals(5,myMath.sum(new int[] {3,2}));
	}
}
