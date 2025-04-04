package Strings;

import java.util.Arrays;

public class s5 {
	public static void display(int[] a) {
		for(int n : a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,58,45,78};
		display(arr);
		Arrays.sort(arr);
		display(arr);
		int pos= Arrays.binarySearch(arr, 58);
		System.out.println("Position : "+pos);
		int[] arr1 = new int[5];
		int[] arr2 =new int[5];
		Arrays.fill(arr1, 5);
		Arrays.fill(arr2, 5);
		System.out.println("Array Fill");
		display(arr1);
		boolean f = Arrays.equals(arr1,arr2);
		System.out.println("Array Equal : " +f);
		String s=Arrays.toString(arr1);
		System.out.println("Array to String : " +s);

	}

}
