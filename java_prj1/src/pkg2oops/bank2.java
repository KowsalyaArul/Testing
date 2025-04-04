package pkg2oops;

public class bank2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     bank_2[] acclist = new bank_2[3];
     acclist[0]=new bank_2(200,"Kowsi",201);
     acclist[1]=new bank_2(300,"Vishnu",202);
     acclist[2]=new bank_2(400,"Ashwin",203);
     acclist[0].show_details();
     acclist[1].show_details();
     acclist[2].show_details();
	}

}
