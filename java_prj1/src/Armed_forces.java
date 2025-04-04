import java.util.ArrayList;
import java.util.Scanner;

import Collections.student1;

public class Armed_forces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age:");
		int age=sc.nextInt();
		
		System.out.print("Enter your Name:");
		String name=sc.next();
		System.out.print("Enter location:");
		String location=sc.next();
		System.out.print("Are you physically Challenged :");
		String pc=sc.next();
		ArrayList<String> str=new ArrayList<String>();
		str.add("Andaman_Nicobar");
		str.add("Chandigarh");
		str.add("Delhi");
		str.add("Ladakh");
		str.add("Daman_diu");
		str.add("Jammu_Kashmir");
		str.add("Pudhucherry");
		str.add("Lakshadweep");
		
		if((age>=18 && age<=35) &&(!str.contains(location) )&& (pc.equals("no"))) {
					System.out.println(name +" you are eligible");
				}
			
		else {
			System.out.println(name +" you are not eligible");
		  }	
		}
		

	}


