package Junits;

public class booking {
	public int routeid;
	public int bookingid;
	public int noofseats;
		public int totalamnt;
	public booking() {}
	public booking( int bookingid,int routeid ,int noofseats ,int totalamnt) {
		this.bookingid=bookingid;
		this.routeid=routeid;
		this.noofseats=noofseats;
		this.totalamnt=totalamnt;
	}

}
