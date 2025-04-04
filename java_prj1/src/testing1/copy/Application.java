package testing1.copy;

import java.util.Scanner;

public class Application {



	

	

	public static void main(String[] args) {
		//Scanner scanner = null;
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String[] UT= {"Andaman","Delhi",
				"Pondicherry","Goa","lakshadeep",
				"Chandigarh","ladakh","j&k"};
		
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		
//		
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Are you Indian Citizen:?(yes/no):\n");
		String Indian=sc.nextLine().toLowerCase();
		
		System.out.println("Enter your location");
		String location=sc.nextLine();
		
		System.out.println("Are you Specially abled person:?(yes/no):");
		String Special=sc.nextLine().toLowerCase();
		
		
		boolean UT1=false;
		
		for(String ut:UT) {
			if(ut.equalsIgnoreCase(location)) { 
				UT1=true;
				break;
			}
		}
		
		
		
//		boolean eligible=(age>=18 && age<=35 ) && Indian.equals("yes") &&  UT.equals("no")  && Special.equals("no")))
		if(age>=16 && age<=35 && Indian.equals("yes") &&  !UT1 && Special.equals("no"))
		{
			System.out.println(name+" is eligible");
		}
		else
		{
			System.out.println(name+" is not eligible");
		}
		
	}

}


	


