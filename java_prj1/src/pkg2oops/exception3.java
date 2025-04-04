package pkg2oops;

public class exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=1,c;
		int arr[]= {34,45,859,89,234};
		try {
			c=a/b;
			System.out.println(c);
			System.out.println(arr[8]);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception catch");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception catch");
		}
		catch(Exception e) {
			System.out.println("In catch block");
		}
		finally {
			System.out.println("finally");
		}

	}

}
