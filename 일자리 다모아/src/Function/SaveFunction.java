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
				Class.forName("org.gjt.mm.mysql.Driver");

			} catch (Exception e) {
				System.out.println("fail");
			}
		}
		public static int savealba(String ID,String AREA, String PAY,String COMPANY,String TEXT,String URL) throws SQLException { // 회원가입
			conn=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "1234");
			stmt = conn.createStatement();
			String query = "SELECT * FROM savealba";
			stmt = conn.createStatement();
			rs=stmt.executeQuery(query);

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
			 rs.close();
				pstmt.close();
				stmt.close();
				conn.close();
			return 1;
		}
		public Vector<Albatext> loadalba() { // 로그인
			Vector<Albatext> albatext = new Vector<>();
			conn = null;
			String query = "SELECT * FROM savealba WHERE ID=";
			query+="'"+Loginpage.ID_.getText()+"'";
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "1234");
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
		public static int saveintern(String ID,String NAME, String PROJECT,String AREA,String NUM,String STATE,String URL) throws SQLException { // 회원가입
			conn=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "1234");
			stmt = conn.createStatement();
			String query = "SELECT * FROM saveintern";
			stmt = conn.createStatement();
			rs=stmt.executeQuery(query);

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
			return 1;
		}
		public Vector<LoadInterntext> loadintern() { // 로그인
			Vector<LoadInterntext> interntext = new Vector<>();
			conn = null;
			String query = "SELECT * FROM saveintern WHERE ID=";
			query+="'"+Loginpage.ID_.getText()+"'";
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "1234");
				stmt = conn.createStatement();
				rs = stmt.executeQuery(query);
				while (rs.next()) {
					interntext.add(new LoadInterntext(rs.getString("NAME"), rs.getString("PROJECT"), rs.getString("AREA"),
							rs.getString("NUM"), rs.getString("STATE")));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return interntext;
		}
}