package Collections;
import java.util.*;

public  class students implements Comparable<students>{
	public String sname;
	public int id;
	public int age;
	
	
	public students(String sname,int id,int age) {
		this.sname=sname;
		this.id=id;
		this.age=age;
	}
	public void display() {
		System.out.println(sname +" "+ id + " " + age);             
	}
	
	
	@Override
	public int compareTo(students  s) {
		// TODO Auto-generated method stub
		return this.age - s.age;
		
	}

}
