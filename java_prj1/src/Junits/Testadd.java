package Junits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testadd {
	@Test

	public  void testSumWithEualNums() {
		addnum obj=new addnum();
		int i,j;
		i=j=11;
		System.err.println("in testSumWithEualNum");
		assertEquals(i+i,obj.add(i,j));
		

	}
	@Test

	public  void testSumWithEualNums1() {
		addnum obj=new addnum();
		System.err.println("in testSumWithEualNum");
		assertEquals(10,obj.add(5,5));
		

	}

}
