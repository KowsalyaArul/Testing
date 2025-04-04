package Collections;

import java.util.ArrayList;

public class Strings {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("apple");
		fruits.remove(2);
		fruits.add(1,"Pineapple");
		for(String s:fruits) {
			System.out.println(s);
		}

	}

}
