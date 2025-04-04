package Strings;
import java.util.*;
public class s4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("Hi kowsi, how are you");
		int m=str.indexOf(" ");
		int n=str.indexOf(",");
		System.out.println(str.substring(m+1, n));

	}

}
