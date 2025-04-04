package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class j2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String jdbcURL= "jdbc:mysql://localhost:3306/as1";
		String dbuname = "root";
		String dbpwd="Password@12";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
		String q="insert into student values(?,?,?,?,?);";
		PreparedStatement pstmt= con.prepareStatement(q);
		pstmt.setInt(1,120);
		pstmt.setString(2, "Rajini");
		pstmt.setInt(3, 100);
		pstmt.setInt(4,50);
		pstmt.setInt(5, 12);
		int rowinserted=pstmt.executeUpdate();
		if(rowinserted>0) {
			System.out.println("A new employee was inserted successfully");
		}
		con.close();

	}

}
