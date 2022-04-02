package com.ds.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import com.ds.junitt.MyMath;

class MyMathTest {
	
	
	MyMath myMath = new MyMath();
	

	@Before
	public	void before() {
		System.out.println("test1");
		assertEquals(6,myMath.sum(new int[] {1,2,3}));
	}	
	@After
	public	void After() {
		System.out.println("After");
		assertEquals(6,myMath.sum(new int[] {1,2,3}));
	}	
	
	@BeforeClass
	public	static void beforeCLass() {
		System.out.println("test1");
	//	assertEquals(6,myMath.sum(new int[] {1,2,3}));
	}	
	@AfterClass
	public	static void AfterClas() {
		System.out.println("After");
	//	assertEquals(6,myMath.sum(new int[] {1,2,3}));
	}	
	
	@Test
	public	void submitwith3numbers() {
		System.out.println("test1");
		assertEquals(6,myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	public	void submitwith1numbers() {
		System.out.println("test2");
		assertEquals(5,myMath.sum(new int[] {3,2}));
	}
}
