package Collections;

public class student {

	public int id;
	public String name;
	public student(String name,int id) {
		this.id=id;
		this.name=name;
	}
	public void show() {
		System.out.println("name is: "+name+", id is: "+id);
	}

}
