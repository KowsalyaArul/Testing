package Junits;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class para_std_avg {
	private int avg,AI,DS,ML,exp_op;
	public para_std_avg(int AI,int DS,int ML,int exp_op) {
		this.AI=AI;
		this.DS=DS;
		this.ML=ML;
		this.exp_op=exp_op;
		System.out.println("M ");
	}
	@Parameterized.Parameters
	public static List<Object[]> data(){
		System.out.println("In data method");
		Object b[][] = new Object[][] {
				{88,90,92,90},
				{70,90,80,80},
				{94,96,98,96},
				{82,84,86,84},
				{54,56,58,56}
	};
	List<Object[]> c=Arrays.asList(b);
	return c;
	}
	@Test
	public void test() {
		System.out.println("AI : "+ AI + " DS : "+ DS +" ML : "+ ML+" exp_op : "+ exp_op );
		average avg=new average();
		assertEquals(exp_op,avg.avg(AI,DS,ML));
	}
	

}
