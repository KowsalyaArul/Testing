package Collections;
import java.util.ArrayList;

import pkg2oops.Student;
public class Objectmeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> ss=new ArrayList<student>();
		student s1=new student("Kowsi",25);
		student s2=new student("Lizard",05);
		student s3=new student("Vishnu",30);
		student s4=new student("Kumar",32);
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		student s5=ss.get(0);
		for(student s6:ss) {
			if(s6.id==30)
				System.out.println("Student name is "+s6.name);
		}

	}

}
