package com.example.JunitProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calculator c=new Calculator();
	@Before
	public void hi() {
		System.out.println("Hello");
	}
	@Test
	public void testAdd() {
		System.out.println(c.add());
	}
	@Test
	public void testSub() {
		System.out.println(c.sub(20,10));
		
	}
	@Test
	public void testDiv() {
		System.out.println(c.div(20,10));
	}
	@Test
	public void testMul() {
		System.out.println(c.mul());
	}
	@Test 
	public void checkAddSub() {
		assertEquals(c.add(),c.add());
	}
	@Test
	public void checkFindMin() {
		int[] a= {20,40,25,60,12};
		SampleMin s=new SampleMin();
		assertEquals(s.findmin(a),12);
	}
	@Test
	public void checkmax() {
		String[] a= {"mani","ramu","ramesh"};
		SampleMin s=new SampleMin();
		assertSame(s.findmaxlength(a),"ramesh");
	}
	@After
	public void display() {
		System.out.println("Bye");
	}
	

}
