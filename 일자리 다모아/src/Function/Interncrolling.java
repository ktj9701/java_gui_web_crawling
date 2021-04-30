package Function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Interncrolling {
	static Connection conn;
	static Statement stmt = null;
	static ResultSet rs = null;

	public Interncrolling() {

		try {
			Class.forName("org.gjt.mm.mysql.Driver");

		} catch (Exception e) {
			System.out.println("fail");
		}
	}

	public Vector<ICT> ICT2021상반기() throws SQLException { // 로그인
		String url = "https://www.ictintern.or.kr/homepage/trainingCompany/companyList.do";
		Vector<ICT> Interntext = new Vector<>();
		conn = null;
		String query = "SELECT * FROM ict";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "1234");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				Interntext.add(new ICT(rs.getString("NAME"), rs.getString("PROJECT"), rs.getString("SUBJECT"),
						rs.getString("AREA"), rs.getString("MAX"), rs.getString("NUM"), url));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Interntext;
	}
	public Vector<IPP> IPP2020하반기() throws SQLException { // 로그인
		String url = "https://ipp.mju.ac.kr/index.do";
		Vector<IPP> ipp = new Vector<>();
		conn = null;
		String query = "SELECT * FROM ipp2020";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "1234");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				ipp.add(new IPP(rs.getString("NAME"), rs.getString("PROJECT"), rs.getString("AREA"),
						rs.getString("NUM"), rs.getString("STATE"),url));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ipp;
	}
}
