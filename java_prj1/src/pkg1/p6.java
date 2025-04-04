package pkg1;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=94382,rem,sum=0,n=num;
		int pos=5;
		while(num>0) {
			rem=num%10;
			if(pos%2!=0) {
				sum=sum+rem;
			}
			pos--;
			num=num/10;
		}
      System.out.println("Sum of odd position digits "+n+" is "+sum);
}
}