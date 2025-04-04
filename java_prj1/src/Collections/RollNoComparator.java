package Collections;
import java.util.*;
public class RollNoComparator implements Comparator<students> {
	public int compare(students s1,students s2) {
		return s1.id - s2.id;
	}
	

}
