package Collections;
import java.util.ArrayList;
public class mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<mob> mbl=new ArrayList<mob>() ;
		mob m1=new mob("oneplus","CELiteNord3",23000,128);
		mob m2=new mob("oneplus","CELiteNord2",23000,128);
		mob m3=new mob("Apple","15pro",200000,256);
		mob m4=new mob("Vivo","v24",3000,128);
		mob m5=new mob("Redmi","A12",14000,128);
		mob m6=new mob("Samsung","G12",17000,128);
		mob m7=new mob("Vivo","v23",20000,128);
		mob m8=new mob("Galaxy","A13",11000,128);
		mob m9=new mob("oneplus","elite3",22000,256);
		mob m10=new mob("Samsung","G34",14000,128);
		
		mbl.add(m1);
		mbl.add(m2);
		mbl.add(m3);
		mbl.add(m4);
		mbl.add(m5);
		mbl.add(m6);
		mbl.add(m7);
		mbl.add(m8);
		mbl.add(m9);
		mbl.add(m10);
		
		mob mm=new mob();
		mm.find_mobile("oneplus",mbl);
		mm.dis_mobile(15000, 20000, mbl);
		mm.dis_details(6, 10000, mbl);
		

}
}
