package pkg2oops;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=10;
		int c;
		try {
		c=b/(a-5);
		System.out.println("c : "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception ");
		}

	}

}
