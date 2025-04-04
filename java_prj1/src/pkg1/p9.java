package pkg1;

import java.util.Scanner;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[5][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
				arr[i][0]=sc.nextInt();
		}
		for(int j=0;j<2;j++) {
			int num=arr[j][0];
			int fact=1;
			for(int k=1;k<=num;k++) {
				fact=fact*k;
				
			}
			arr[j][1]=fact;
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				
				System.out.print(arr[i][j]+" ");
				
			}System.out.println();
		}
		
		
	}

}
