package Collections;
import java.util.*;
public class comparable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<students> std_list = new ArrayList<students>();
		std_list.add(new students("Kowsi",25,21));
		std_list.add(new students("Vishnu",30,24));
		std_list.add(new students("Ashwin",05,20));
		std_list.add(new students("Kumar",32,20));
		for(students s: std_list) {
			System.out.println(s.id + " " + s.sname + " "+ s.age);
		}
		System.out.println();
		System.out.println();
		
		Collections.sort(std_list,new name_comparator());
		
		for(students s : std_list) {
			System.out.println(s.id + " " + s.sname + " "+ s.age);
		}
		System.out.println("\n \n");
		

	}

}
