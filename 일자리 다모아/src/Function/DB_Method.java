package Function;

import java.sql.SQLException;

public class DB_Method {
	private DB db;
	public DB_Method() {
		db = DB.getInstance();
	}
	public boolean Login(String ID, String PWD) throws SQLException { // 로그인
		String query = "SELECT * FROM Login";
		DB.stmt = DB.conn.createStatement();
		if (DB.stmt.execute(query)) {
			DB.rs = DB.stmt.getResultSet();
		}
		while (DB.rs.next()) {
			if (DB.rs.getString("ID").equals(ID) && DB.rs.getString("PWD").equals(PWD)) {
				System.out.println("Login Success");
				DB.stmt.close();
				DB.rs.close();
				return true;
			}
		}
		System.out.println("Login Fail");
		DB.stmt.close();
		DB.rs.close();
		return false;
	}

	public boolean Join(String ID, String PWD) throws SQLException { // 회원가입
		String query = "SELECT * FROM Login";
		DB.stmt = DB.conn.createStatement();
		if (DB.stmt.execute(query)) {
			DB.rs = DB.stmt.getResultSet();
		}
		while (DB.rs.next()) {
			if (DB.rs.getString("ID").equals(ID)) {
				System.out.println("Join Fail");
				return false;
			}
		}
		 query = "INSERT INTO Login VALUES(" + "'" + ID + "'," + "'" + PWD + "'" + ")";
			DB.stmt.executeUpdate(query);
			System.out.println("Join Success");
		return true;
	}
}
