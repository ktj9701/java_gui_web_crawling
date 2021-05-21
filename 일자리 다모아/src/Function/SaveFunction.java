package Function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import GUI.Loginpage;

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
		public static void savealba(String ID,String AREA, String PAY,String COMPANY,String TEXT,String URL) throws SQLException { // 회원가입
			conn=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "--", "--");
			stmt = conn.createStatement();
			String query="SELECT * FROM savealba";
			rs=stmt.executeQuery(query);
			while (rs.next()) {
				if (rs.getString("URL").equals(URL)&&rs.getString("ID").equals(ID)) {
					System.out.println("SAVE FAIL");
					return;
				}
			}
			PreparedStatement pstmt = null;
			
			 query = "INSERT INTO savealba (ID,AREA,PAY,COMPANY,TEXT,URL)";
			 query+="values (?,?,?,?,?,?)";
			 pstmt = conn.prepareStatement(query);
			 pstmt.setString(1,ID);
			 pstmt.setString(2,AREA);
			 pstmt.setString(3,PAY);
			 pstmt.setString(4,COMPANY);
			 pstmt.setString(5,TEXT);
			 pstmt.setString(6,URL);
			 int result = pstmt.executeUpdate();
				pstmt.close();
				stmt.close();
				conn.close();

		}
		public Vector<Albatext> loadalba() { // 알바불러오기
			Vector<Albatext> albatext = new Vector<>();
			conn = null;
			String query = "SELECT * FROM savealba WHERE ID=";
			query+="'"+Loginpage.ID_.getText()+"'";
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "--", "--");
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
		public static void deletealba(String URL) throws SQLException { // 회원가입
			conn=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "--", "--");
			stmt = conn.createStatement();
			String query;

			PreparedStatement pstmt = null;
			
			 query = "DELETE FROM savealba WHERE URL='"+URL+"'AND ID='"+Loginpage.ID_.getText()+"'";

			 pstmt = conn.prepareStatement(query);
			 int result = pstmt.executeUpdate();
				pstmt.close();
				stmt.close();
				conn.close();
		}
		public static void saveintern(String ID,String NAME, String PROJECT,String AREA,String NUM,String STATE,String URL) throws SQLException { // 회원가입
			conn=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "--", "--");
			String query = "SELECT * FROM saveintern";
			rs=stmt.executeQuery(query);
			while (rs.next()) {
				if (rs.getString("PROJECT").equals(PROJECT)&&rs.getString("ID").equals(ID)) {
					System.out.println("SAVE FAIL");
					return;
				}
			}
			PreparedStatement pstmt = null;
			
			 query = "INSERT INTO saveintern (ID,NAME,PROJECT,AREA,NUM,STATE,URL)";
			 query+="values (?,?,?,?,?,?,?)";
			 pstmt = conn.prepareStatement(query);
			 pstmt.setString(1,ID);
			 pstmt.setString(2,NAME);
			 pstmt.setString(3,PROJECT);
			 pstmt.setString(4,AREA);
			 pstmt.setString(5,NUM);
			 pstmt.setString(6,STATE);
			 pstmt.setString(7,URL);
			 int result = pstmt.executeUpdate();
			 rs.close();
				pstmt.close();
				stmt.close();
				conn.close();
		}
		public Vector<LoadInterntext> loadintern() { // 인턴불러오기
			Vector<LoadInterntext> interntext = new Vector<>();
			conn = null;
			String query = "SELECT * FROM saveintern WHERE ID=";
			query+="'"+Loginpage.ID_.getText()+"'";
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "--", "--");
				stmt = conn.createStatement();
				rs = stmt.executeQuery(query);
				while (rs.next()) {
					interntext.add(new LoadInterntext(rs.getString("NAME"), rs.getString("PROJECT"), rs.getString("AREA"),
							rs.getString("NUM"), rs.getString("STATE"),rs.getString("URL")));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return interntext;
		}
		public static void deleteintern(String PROJECT) throws SQLException { // 회원가입
			conn=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "--", "--");
			stmt = conn.createStatement();
			String query;

			PreparedStatement pstmt = null;
			
			 query = "DELETE FROM saveintern WHERE PROJECT='"+PROJECT+"'AND ID='"+Loginpage.ID_.getText()+"'";
			 pstmt = conn.prepareStatement(query);
			 int result = pstmt.executeUpdate();
				pstmt.close();
				stmt.close();
				conn.close();
		}
}