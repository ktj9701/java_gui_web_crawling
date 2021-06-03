package Function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.Date;
import GUI.Loginpage;
import GUI.Repositorypage;

public class SaveFunction {
	static Connection conn;
	static Statement stmt = null;
	static ResultSet rs = null;

	public SaveFunction() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception e) {
			System.out.println("fail");
		}
	}

	public static int savealba(String ID, String AREA, String PAY, String COMPANY, String TEXT, String URL)
			throws SQLException { // 회원가입
		conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2", "1Q2w3e4r!!");
		stmt = conn.createStatement();
		String query = "SELECT * FROM savealba";
		rs = stmt.executeQuery(query);
		while (rs.next()) {
			if (rs.getString("URL").equals(URL) && rs.getString("ID").equals(ID)) {
				System.out.println("SAVE FAIL");
				return -1;
			}
		}
		PreparedStatement pstmt = null;

		query = "INSERT INTO savealba (ID,AREA,PAY,COMPANY,TEXT,URL,DATE)";
		query += "values (?,?,?,?,?,?,now())";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, ID);
		pstmt.setString(2, AREA);
		pstmt.setString(3, PAY);
		pstmt.setString(4, COMPANY);
		pstmt.setString(5, TEXT);
		pstmt.setString(6, URL);

		int result = pstmt.executeUpdate();
		pstmt.close();
		stmt.close();
		conn.close();
		return 1;
	}

	public Vector<Albatext> loadalba() { // 알바불러오기
		Vector<Albatext> albatext = new Vector<>();
		conn = null;
		if (Repositorypage.index == 0) {
			String query = "SELECT * FROM savealba WHERE ID=";
			query += "'" + Loginpage.ID_.getText() + "'";
			try {
				conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2",
						"1Q2w3e4r!!");
				stmt = conn.createStatement();
				rs = stmt.executeQuery(query);
				while (rs.next()) {
					albatext.add(new Albatext(rs.getString("AREA"), rs.getString("PAY"), rs.getString("COMPANY"),
							rs.getString("TEXT"), rs.getString("URL")));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return albatext;
		}
		else {
			String query = "SELECT * FROM savealba WHERE ID=";
			query += "'" + Loginpage.ID_.getText() + "'ORDER BY DATE DESC";
			try {
				conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2",
						"1Q2w3e4r!!");
				stmt = conn.createStatement();
				rs = stmt.executeQuery(query);
				while (rs.next()) {
					albatext.add(new Albatext(rs.getString("AREA"), rs.getString("PAY"), rs.getString("COMPANY"),
							rs.getString("TEXT"), rs.getString("URL")));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return albatext;
		}
	}

	public static void deletealba(String URL) throws SQLException { // 회원가입
		conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2", "1Q2w3e4r!!");
		stmt = conn.createStatement();
		String query;

		PreparedStatement pstmt = null;

		query = "DELETE FROM savealba WHERE URL='" + URL + "'AND ID='" + Loginpage.ID_.getText() + "'";

		pstmt = conn.prepareStatement(query);
		int result = pstmt.executeUpdate();
		pstmt.close();
		stmt.close();
		conn.close();
	}

	public static int saveintern(String ID, String NAME, String PROJECT, String AREA, String NUM, String STATE,
			String URL) throws SQLException { // 회원가입
		conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2", "1Q2w3e4r!!");
		stmt = conn.createStatement();
		String query = "SELECT * FROM saveintern";
		rs = stmt.executeQuery(query);
		while (rs.next()) {
			if (rs.getString("PROJECT").equals(PROJECT) && rs.getString("ID").equals(ID)) {
				System.out.println("SAVE FAIL");
				return -1;
			}
		}
		PreparedStatement pstmt = null;

		query = "INSERT INTO saveintern (ID,NAME,PROJECT,AREA,NUM,STATE,URL,DATE)";
		query += "values (?,?,?,?,?,?,?,now())";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, ID);
		pstmt.setString(2, NAME);
		pstmt.setString(3, PROJECT);
		pstmt.setString(4, AREA);
		pstmt.setString(5, NUM);
		pstmt.setString(6, STATE);
		pstmt.setString(7, URL);
		int result = pstmt.executeUpdate();
		rs.close();
		pstmt.close();
		stmt.close();
		conn.close();
		return 1;
	}

	public Vector<LoadInterntext> loadintern() { // 인턴불러오기
		Vector<LoadInterntext> interntext = new Vector<>();
		conn = null;
		if(Repositorypage.index==0) {
		String query = "SELECT * FROM saveintern WHERE ID=";
		query += "'" + Loginpage.ID_.getText() + "'";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2",
					"1Q2w3e4r!!");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				interntext.add(new LoadInterntext(rs.getString("NAME"), rs.getString("PROJECT"), rs.getString("AREA"),
						rs.getString("NUM"), rs.getString("STATE"), rs.getString("URL")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return interntext;
	}
		else {
			String query = "SELECT * FROM saveintern WHERE ID=";
			query += "'" + Loginpage.ID_.getText() + "'ORDER BY DATE DESC";
			try {
				conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2",
						"1Q2w3e4r!!");
				stmt = conn.createStatement();
				rs = stmt.executeQuery(query);
				while (rs.next()) {
					interntext.add(new LoadInterntext(rs.getString("NAME"), rs.getString("PROJECT"), rs.getString("AREA"),
							rs.getString("NUM"), rs.getString("STATE"), rs.getString("URL")));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return interntext;
		}
	}
	public static void deleteintern(String PROJECT) throws SQLException { // 회원가입
		conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2", "1Q2w3e4r!!");
		stmt = conn.createStatement();
		String query;

		PreparedStatement pstmt = null;

		query = "DELETE FROM saveintern WHERE PROJECT='" + PROJECT + "'AND ID='" + Loginpage.ID_.getText() + "'";
		pstmt = conn.prepareStatement(query);
		int result = pstmt.executeUpdate();
		pstmt.close();
		stmt.close();
		conn.close();
	}
}