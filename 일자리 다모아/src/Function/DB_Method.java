package Function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Method{
		static Connection conn;
		static Statement stmt = null;
		static ResultSet rs = null;
		
		public DB_Method() {
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
			
			} catch (Exception e) {
				System.out.println("fail");
			}
	}

	public int Login(String ID, String PWD) throws SQLException { // �α���
		conn=null;
		String query = "SELECT * FROM Login";
		conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/Login?useSSL=false", "team2", "1Q2w3e4r!!");
		stmt = conn.createStatement();

		rs=stmt.executeQuery(query);
		while (rs.next()) {
			if (rs.getString("ID").equals(ID) && rs.getString("PWD").equals(PWD)) {
				System.out.println("Login Success");	
				rs.close();
				stmt.close();
				conn.close();
				return 1;
			}
		}
		System.out.println("Login Fail");
	
		rs.close();
		stmt.close();
		conn.close();

		return -1;
	}

	public static int Join(String ID, String PWD) throws SQLException { // ȸ������
		conn=null;
		conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/Login?useSSL=false", "team2", "1Q2w3e4r!!");
		stmt = conn.createStatement();
		String query = "SELECT * FROM Login";
		stmt = conn.createStatement();
		rs=stmt.executeQuery(query);
		while (rs.next()) {
			if (rs.getString("ID").equals(ID)) {
				System.out.println("Join Fail");
				return -1;
			}
		}
		PreparedStatement pstmt = null;
		
		 query = "INSERT INTO Login (ID, PWD)";
		 query+="values (?,?)";
		 pstmt = conn.prepareStatement(query);
		 pstmt.setString(1,ID);
		 pstmt.setString(2,PWD);
		 
		 int result = pstmt.executeUpdate();
		 rs.close();
			pstmt.close();
			stmt.close();
			conn.close();
		return 1;
	}
}
