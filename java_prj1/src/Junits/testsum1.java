package Junits;

import static org.junit.Assert.*;

import org.junit.Test;                                                                                                                                                                                                             

public class testsum1 {
	sumofnum s;
	int num=94382;
	int num1=2020;

	@Test
	public void test() {
		s=new sumofnum();
		System.out.println("in test1");
		int m=s.sumofdigits(num);
		assertEquals(m,14);
		
	}
	@Test
	public void test1() {
		s=new sumofnum();
		System.out.println("in test1");
		int m=s.sumofdigits(num1);
		assertEquals(m,25);
		
	}

} 
