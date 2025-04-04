package Junits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testsub {
	@Test

	public  void test1() {
		subnum obj1=new subnum();
		System.out.println("in TestSub test1");
		assertEquals(7,obj1.sub(12,5));

	}
	@Test

	public  void test2() {
		subnum obj1=new subnum();
		System.out.println("in TestSub test1");
		assertEquals(-8,obj1.sub(-11,-3));

	}

}
