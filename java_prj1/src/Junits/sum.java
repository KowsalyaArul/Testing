package Junits;

public class sum {
	public int sum=0;
	public int getsum(int[] arr) {
		for(int i: arr) {
			sum=sum+i;
		}
		return sum;
	}

}