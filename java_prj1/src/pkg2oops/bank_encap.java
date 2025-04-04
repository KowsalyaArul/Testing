package pkg2oops;

public class bank_encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank_account acc1=new bank_account();
		acc1.setAcc_no(1235);
		acc1.setName("Kowsi");
		System.out.println("Account No. : "+acc1.getAcc_no() + " \nAccount Name : "+acc1.getName());

	}

}
