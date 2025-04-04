package pkg2oops;

public class c1 {
	int acc_no;
	String acc_name;
	float bal;
	public void deposit(float amnt) {
		bal=bal+amnt;
		System.out.println(this.acc_name+": Deposit of "+ amnt +" successful");
	}
	public void withdraw(float amnt) {
		bal=bal-amnt;
		System.out.println(this.acc_name+": Withdraw of "+ amnt +" successful");
	}
	public c1(int acc_no,String acc_name,float bal) {
		this.acc_no=acc_no;
		this.acc_name=acc_name;
		this.bal=bal;
	}
    public c1() {
    	
    }
    public void show_details() {
    	System.out.println("-----------------------------------------------------------------");
    	System.out.println(" Account no : "+ acc_no
    			+ "\n Account Name : "+ acc_name
    			+ "\n Balance : "+ bal);
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1 kowsi=new c1(2000," Kowsi",10000);
		kowsi.show_details();
		kowsi.deposit( 100000);
		kowsi.show_details();
		kowsi.withdraw( 5000);
		kowsi.show_details();

	}
	

}
