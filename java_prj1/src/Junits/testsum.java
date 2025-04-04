package Junits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class testsum {
	sum s;
	int[] num= {12,58,78,2};
	

	@Test
	public void test() {
		s=new sum();
		System.out.println("in test1");
		int m=s.getsum(num);
		assertEquals(m,150);
		
	}

}
