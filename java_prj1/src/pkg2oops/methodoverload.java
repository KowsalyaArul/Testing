package pkg2oops;

public class methodoverload {
	public static int add(int a,int b) {
		System.out.println("Added with 2 parameters");
		return a+b;
	}
	public static int add(int a,int b,int c) {
		System.out.println("Added with 3 parameters");
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		int x=add(a,b);
		int y=add(a,b,c);
		System.out.println(x);
		System.out.println(y);


	}

}
