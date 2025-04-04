package Hashmap;
import java.util.*;
import java.util.Map.Entry;
public class h2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,std_detail> m=new HashMap<Integer,std_detail>();
		std_detail s1=new std_detail("Kowsi",101,25);
		std_detail s2=new std_detail("Vishnu",102,30);
		m.put(s1.id, s1);
		m.put(s2.id, s2);
		for(Entry<Integer, std_detail> e: m.entrySet()) {
			std_detail ss=e.getValue();
			System.out.println("ID: "+e.getKey()+" Name: "+ss.name+"Age : "+ss.age);
		}
		

	}

}
