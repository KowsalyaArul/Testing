package pkg1;

import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bal;
		int pin=2000;
		System.out.println("Enter the pin :");
		Scanner sc=new Scanner(System.in);
		int pin1=sc.nextInt();
		int n=1;
		if(pin1==pin) {
			System.out.println("Pin entered successfully");
			System.out.println("1.Check balance");
			System.out.println("2.Withdraw amount");
			System.out.println("3.Deposit money");
			System.out.println("4.Exit");
			
			bal=5000;
			do{ 
				n=sc.nextInt();
			switch(n) {
			case 1:
			System.out.println(bal);
			break;
			case 2:
			System.out.println("Enter withdraw amount:");
			int amount=sc.nextInt();
			if(amount<=bal) {
				bal=bal-amount;
				System.out.println("Amount withdraw successfully");
				
			}else {
				System.out.println("Insufficient Balance");
			}
			
			break;
			case 3:
				System.out.println("Enter deposit money");
				int damnt=sc.nextInt();
				bal=bal+damnt;
				System.out.println("Your new balance :"+bal);
				break;
			case 4:
				break;
				default:
					break;
			}
			}while(n<=4);
			}
		else {
			System.out.println("Invalid pin");
		  
		  }
		 
		 }
		
	}


