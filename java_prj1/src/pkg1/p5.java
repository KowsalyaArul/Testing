package pkg1;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=94382,rem,sum=0,n=num;
		while(num>0) {
			rem=num%10;
			if(rem%2==0) {
				sum=sum+rem;
			}
			num=num/10;
		}
      System.out.println("Sum of even digits of "+n+" is "+sum);
	}

}
