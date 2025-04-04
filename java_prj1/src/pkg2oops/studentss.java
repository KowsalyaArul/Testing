package pkg2oops;

public class studentss {
	public String student_name;
	public int student_id;
	public int marks_cc;
	public int marks_ml;	
	public float[] arr=new float[3];
	public int average;

	public void student(String name ,int id ,int cc,int ml) {
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
