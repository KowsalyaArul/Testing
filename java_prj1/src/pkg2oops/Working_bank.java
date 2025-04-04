package pkg2oops;

public class Working_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank1 b;
		b= new SBI();
		System.out.println("SBI Bank Rate of Interest is: "+b.getRateOfInterest()+"%");
		b=new icici();
		System.out.println("ICICI Bank Rate of Interest is: "+b.getRateOfInterest()+"%");

	}

}
