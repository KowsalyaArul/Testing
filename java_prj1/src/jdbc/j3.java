package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class j3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String jdbcURL= "jdbc:mysql://localhost:3306/as1";
		String dbuname = "root";
		String dbpwd="Password@12";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
		String updatesql="delete from student where sid=?";
		PreparedStatement pstmt= con.prepareStatement(updatesql);
		pstmt.setInt(1,120);
		int rowdelete = pstmt.executeUpdate();
		if(rowdelete>0) {
			System.out.println("Employee deleted successfully");
		}
		con.close();

	}

}
