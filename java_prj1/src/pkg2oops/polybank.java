package pkg2oops;

public class polybank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     bank b;
     b=new canara();
     System.out.println("Canara : "+b.getRateOfInterest());
     b=new hdfc();
     System.out.println("HDFC : "+b.getRateOfInterest());
	}

}
