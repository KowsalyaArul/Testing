package pkg2oops;

public class bank_2 {
	
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
	public bank_2(int acc_no,String acc_name,float bal) {
		this.acc_no=acc_no;
		this.acc_name=acc_name;
		this.bal=bal;
	}
    public bank_2() {
    	
    }
    public void show_details() {
    	System.out.println("-----------------------------------------------------------------");
    	System.out.println(" Account no : "+ acc_no
    			+ "\n Account Name : "+ acc_name
    			+ "\n Balance : "+ bal);
    	
    }
}
