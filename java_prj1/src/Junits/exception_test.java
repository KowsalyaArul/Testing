package Junits;

import org.junit.Test;

public class exception_test {
	@Test(expected=ArithmeticException.class)
	public void testDivisionOnByZero(){
		int n=1/0;
	}
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void arrayoutofbound(){
		int[] arr=new int[4];
		arr[10]=10;
	}

}
