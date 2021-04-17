package Function;

import java.sql.*;

public class DB {
	static Connection conn;
	static Statement stmt = null;
	static ResultSet rs = null;
	private static DB db;
	
	private DB() {}
	
	public static DB getInstance() {
	
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login?useSSL=false", "root", "1234");
			stmt = conn.createStatement();
			db = new DB();
		} catch (Exception e) {
			System.out.println("fail");
		}
		return db;
	}
}
