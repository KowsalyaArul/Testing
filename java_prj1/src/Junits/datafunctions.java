package Junits;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
public class datafunctions {
	public static HashMap<Integer,busroute> hm1=new HashMap<Integer,busroute>();
	public static HashMap<Integer,booking> hm2=new HashMap<Integer,booking>();
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String jdbcURL= "jdbc:mysql://localhost:3306/as3";
		String dbuname = "root";
		String dbpwd="Password@12";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
		Statement stmt= con.createStatement();
		String q="select * from busroute";
		String r="select*from booking";
		ResultSet rs=stmt.executeQuery(q);
		
		while(rs.next()) {
			int rid=rs.getInt("routeid");
			String org=rs.getString("origin");
			String des=rs.getString("destination");
			int tseats=rs.getInt("totalseats");
			int rseats=rs.getInt("remainseats");
			int cost=rs.getInt("cost");
			busroute br=new busroute(rid, org, des, tseats, rseats, cost);
			hm1.put(rid,br);}
		    System.out.println("RouteId "+" From"+"    \t"+"Destination"+"   \t"+"TotalSeats"+"\t"+"Remaining Seats"+"\t"+"Cost");
			for(Map.Entry<Integer,busroute> e: hm1.entrySet()) {
				busroute bb1 =e.getValue();
				System.out.println(bb1.routeid+"     \t"+bb1.origin+"   \t"+bb1.destination+"     \t"+bb1.totalseats+"        \t"+bb1.remainseats+"          \t"+bb1.cost);
			}
		ResultSet qs=stmt.executeQuery(r);
		while(qs.next()) {
			int bid=qs.getInt("bookingid");
			int roid=qs.getInt("routeid");
			int nseats=qs.getInt("noofseats");
			int tamnt=qs.getInt("totalamnt");
			booking bok=new booking(bid, roid, nseats, tamnt);
			hm2.put(bid,bok);}
			busroute br=new busroute();
			br.bookticket(hm1,hm2);
			//putdata(con);
			con.close();
		
		}
		
  
}
//public static void putdata(Connection con) {
	//PreparedStatement pstmt=con.prepareStatement("Update busroute set remainseats=? where routeid=?");
	
	//}
