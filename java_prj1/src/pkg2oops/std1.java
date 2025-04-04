package pkg2oops;

public class std1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.Student("kowsi",01,92,96);
		s2.Student("sharmi",02,100,70);
		s3.Student("priya",03,55,93);
		s1.average();
		s2.average();
		s3.average();
		if((s1.average>s2.average) || (s1.average>s3.average)) {
			System.out.println("With marks "+s1.average +", "+ s1.student_name+" is the highest score");
		}
		else if((s2.average>s1.average) || (s2.average>s3.average)) {
			System.out.println("With marks "+s2.average +", "+ s2.student_name+" is the highest score");
		}
		else if((s3.average>s1.average) || (s3.average>s2.average)) {
			System.out.println("With marks "+s3.average +", "+ s3.student_name+" is the highest score");
		}

	}

}
