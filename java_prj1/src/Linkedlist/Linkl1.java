package Linkedlist;

import java.util.LinkedList;

public class Linkl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> p1=new LinkedList<>();
		p1.add("Kowsi");
		p1.add("Vishnu");
		p1.add("Ashwin");
		p1.add("Kumar");
		System.out.println(p1);
		p1.add(0,"Hi Hello");
		System.out.println(p1);
		System.out.println("First : "+p1.getFirst());
		System.out.println("Last : "+p1.getLast());
		p1.removeLast();
		System.out.println(p1);

	}

}

