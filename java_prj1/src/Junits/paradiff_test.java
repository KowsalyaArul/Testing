package Junits;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class paradiff_test {
	 private int[][] b;
	 average avg=new average();
	 
	@Before
	public void setup() {
	 b = new int[][] {
				{88,90,92,90},
				{70,90,80,80},
				{94,96,98,96}
			};
			
	}
	
	@Test
	public void test() {
		int data[]=b[0];
		System.out.println("AI : "+ data[0] + " DS : "+ data[1] +" ML : "+ data[2]+" Average : "+data[3] );
		assertEquals(data[3],avg.avg(data[0],data[1],data[2]));
		
	}
	@Test
	public void test1() {
		int data[]=b[1];
		System.out.println("AI : "+ data[0] + " DS : "+ data[1] +" ML : "+ data[2]+" Average : "+data[3] );
		assertEquals(data[3],avg.avg(data[0],data[1],data[2]));
		
	}
	@Test
	public void test2() {
		int data[]=b[2];
		System.out.println("AI : "+ data[0] + " DS : "+ data[1] +" ML : "+ data[2]+" Average : "+data[3] );
		assertEquals(data[3],avg.avg(data[0],data[1],data[2]));
		
	}
	
	

}





