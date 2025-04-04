package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Collections.students;

public class inserts {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String jdbcURL= "jdbc:mysql://localhost:3306/as2";
		String dbuname = "root";
		String dbpwd="Password@12";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
		String q="insert into student(sid,sname,phy,che) values(?,?,?,?);";
		PreparedStatement pstmt= con.prepareStatement(q);
		pstmt.setInt(1,6);
		pstmt.setString(2, "Rajini");
		pstmt.setInt(3, 100);
		pstmt.setInt(4,50);
		
		int rowinserted=pstmt.executeUpdate();
		if(rowinserted>0) {
			System.out.println("A new employee was inserted successfully \n");
		}
		

		HashMap<Integer,student> students=new HashMap<>();
		Connection conm=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
		Statement stmt= conm.createStatement();
		String q1="select * from student";
		ResultSet rs=stmt.executeQuery(q1);
		while(rs.next()) {
			int id=rs.getInt("sid");
			String n=rs.getString("sname");
			int m1=rs.getInt("phy");
			int m2=rs.getInt("che");
			
			student s=new student();
			int averg=(m1+m2)/2;
			
			
			student student=new student(id,n,m1,m2,averg);
			students.put(s.sid,student);
			
			// System.out.println(id + " "+n+" "+m1+" "+m2+" "+averg);
			for(Map.Entry<Integer,student> e: students.entrySet()) {
				student s1 =e.getValue();
				System.out.println(" Id : "+s1.sid+"\n Name : "+s1.sname+" \n Physics : "+s1.phy+"\n Chemistry : "+s1.che+"\n Average : "+s1.averg+"\n ");
			}
			String q2="update student set averg=? where sid=?";
			PreparedStatement pstmt1= con.prepareStatement(q2);
			
			pstmt1.setInt(1,averg);
			pstmt1.setInt(2, id);
			int rowupdated =pstmt1.executeUpdate();
			if(rowupdated>0) {
				System.out.println(rowupdated);
			}
			//con.close();
		}
	
			// TODO Auto-generated method stub
			
			

		}
		
		
	}



