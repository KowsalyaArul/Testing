package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class j4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String jdbcURL= "jdbc:mysql://localhost:3306/as1";
		String dbuname = "root";
		String dbpwd="Password@12";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
		String q="update student set sid=? where deptid=?";
		PreparedStatement pstmt= con.prepareStatement(q);
		pstmt.setInt(1,9);
		pstmt.setInt(2, 1);
		int rowupdated =pstmt.executeUpdate();
		if(rowupdated>0) {
			System.out.println("A new employee was updated successfully");
		}
		con.close();

	}

}
