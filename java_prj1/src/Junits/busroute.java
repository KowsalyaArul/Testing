package Junits;
import java.util.HashMap;
import java.util.Scanner;

public class busroute extends datafunctions{
	public int routeid;
	public String origin ;
	public String destination ;
	int totalseats ;
	int remainseats ;
	int cost ;
	public busroute() {}
	public busroute( int routeid,String origin,String destination,int totalseats ,int remainseats ,int cost ) {
		this.routeid=routeid;
		this.origin=origin;
		this.destination=destination;
		this.totalseats=totalseats;
		this.remainseats=remainseats;
		this.cost=cost;
	}
	public void bookticket(HashMap<Integer,busroute> hm1, HashMap<Integer,booking> hm2) {
		System.out.println("Enter the Route id : ");
		Scanner sc=new Scanner(System.in);
	    int i;
	    i=sc.nextInt();
	    while(i==1) {
	    	System.out.println("Enter route id :");
		int rid=sc.nextInt();
		if(!hm1.containsKey(rid)) {
			System.out.println("InValid route id");
			return;
		}
	    
		busroute sroute=hm1.get(rid);
	    
		System.out.println("Enter no.of seats to book");
		int nseats=sc.nextInt();
		if(nseats>sroute.remainseats) {
			System.out.println("Sorry!!!!!Seats are not available.\nAvailable: "+sroute.remainseats);
			return;
		}
		else {
			System.out.println("Ticket available");
		}
		sroute.remainseats-=nseats;
		int tot=sroute.cost*nseats;
		System.out.println("Total amount : "+tot);
		
		
	}
}
	
	

}
