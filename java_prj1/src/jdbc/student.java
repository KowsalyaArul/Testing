package jdbc;

public class student   {
	public int sid;
	public String sname;
	public int phy;
	public int che;
	public int averg;
	public student(int sid,String sname,int phy,int che,int averg) {
		this.sid=sid;
		this.sname=sname;
		this.phy=phy;
		this.che=che;
		this.averg=averg;
	}
	public student() {}
	public void display(int phy,int che) {
		int averg=(phy+che)/2;
	}

}
