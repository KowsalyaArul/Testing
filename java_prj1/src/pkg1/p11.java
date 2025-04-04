package pkg1;

import java.util.Arrays;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,8,3,2};
		Arrays.sort(arr);
		for(int n:arr) {
			System.out.println(arr+" ");
		}
	    int pos=Arrays.binarySearch(arr, 8);
	    System.out.println("\n 8 is found in the position : "+pos);
	}

}
