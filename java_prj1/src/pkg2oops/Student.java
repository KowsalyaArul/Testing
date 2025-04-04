package pkg2oops;

public class Student {

		String student_name;
		int student_id;
		int marks_cc;
		int marks_ml;	
		int average;
		
		public void Student(String name ,int id ,int cc,int ml) {
			this.student_name = name;
			this.student_id = id;
			this.marks_cc = cc;
			this.marks_ml = ml;
		
			 average=(marks_cc+marks_ml)/2;
			System.out.println("The average marks scored by " + student_name + " is " + average);
		}
		public void average() {
			
			 average=(marks_cc+marks_ml)/2;
			
		}
		
}	


