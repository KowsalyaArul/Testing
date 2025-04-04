package pkg1;

import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int d=0;
		char c=sc.next().charAt(0);
		switch(c) {
		case '+':
		d=a+b;
		System.out.println("Addition:"+d);
		break;
		case '-':
		d=a-b;
		System.out.println("Subtraction:"+d);
		break;
		case '*':
		d=a*b;
		System.out.println("Multiplication:"+d);
		break;
		case '/':
		d=a/b;
		System.out.println("Division:"+d);
		break;
		default:
		System.out.println("Nothing is matched");
		
		}
       
	}

}
