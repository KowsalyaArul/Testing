package Junits;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class parametrizedeg {
	private int num1,num2,exp_op;
	public parametrizedeg(int num1,int num2,int exp_op) {
		this.num1=num1;
		this.num2=num2;
		this.exp_op=exp_op;
		System.out.println("In constructor");
	}
	@Parameterized.Parameters
	public static List<Object[]> data(){
		System.out.println("In data method");
		Object b[][] = new Object[][] {
				{1,2,3},
				{4,5,9},
				{5,6,11},
				{-9,-2,-11}
	};
	List<Object[]> c=Arrays.asList(b);
	return c;
	}
	public int sum(int a,int b) {
		int c=a+b;
		System.out.println("In sum");
		return c;
	}
	@Test
	public void test() {
		System.out.println("num1 : "+ num1 + "num2 : "+ num2 +"exp_op : "+ exp_op );
		assertEquals(exp_op,sum(num1,num2));
	}

}
