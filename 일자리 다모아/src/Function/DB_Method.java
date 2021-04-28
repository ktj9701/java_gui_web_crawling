package Function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Method{
		static Connection conn;
		static Statement stmt = null;
		static ResultSet rs = null;
		
		public DB_Method() {
		
			try {
				Class.forName("org.gjt.mm.mysql.Driver");
			
			} catch (Exception e) {
				System.out.println("fail");
			}
	}

	public boolean Login(String ID, String PWD) throws SQLException { // 로그인
		conn=null;
		String query = "SELECT * FROM Login";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
		//if (DB.stmt.execute(query)) {
		//	DB.rs = DB.stmt.getResultSet();
		//}
		rs=stmt.executeQuery(query);
		while (rs.next()) {
			if (rs.getString("ID").equals(ID) && rs.getString("PWD").equals(PWD)) {
				System.out.println("Login Success");	
				rs.close();
				stmt.close();
				conn.close();
				return true;
			}
		}
		System.out.println("Login Fail");
	
		rs=null;
		stmt=null;

		return false;
	}

	public boolean Join(String ID, String PWD) throws SQLException { // 회원가입
		conn=null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
		String query = "SELECT * FROM Login";
		stmt = conn.createStatement();
		//if (DB.stmt.execute(query)) {
		//	DB.rs = DB.stmt.getResultSet();
		//}
		rs=stmt.executeQuery(query);
		while (rs.next()) {
			if (rs.getString("ID").equals(ID)) {
				System.out.println("Join Fail");
				return false;
			}
		}
		 query = "INSERT INTO Login VALUES(" + "'" + ID + "'," + "'" + PWD + "'" + ")";
		stmt.executeUpdate(query);
			System.out.println("Join Success");
			
			stmt=null;
			rs=null;

		return true;
	}
}
