package Collections;
import java.util.*;
import java.util.Arrays;

public class sortings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nlist=Arrays.asList(8,14,29,30,21);
		System.out.println(nlist);
		
		Collections.sort(nlist);
		System.out.println(nlist);
		
		Collections.reverse(nlist);
		System.out.println(nlist);

	}

}
