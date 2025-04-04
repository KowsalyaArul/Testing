package pkg2oops;

public class exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {20,5,0,100,2,40};
		try {
		System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Out Of bound");
		}
	}

}
