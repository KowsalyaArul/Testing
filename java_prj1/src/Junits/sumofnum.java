package Junits;

public class sumofnum {
	public static int sumofdigits(int num) {
		//int num=94382,
		int rem,sum=0,n=num;
		while(num>0) {
			rem=num%10;
			if(rem%2==0) {
				sum=sum+rem;
			}
			num=num/10;
		}
      return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
