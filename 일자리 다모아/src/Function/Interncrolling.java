package Function;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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
		}
	}

	public Vector<ICT> ICT2021상반기() throws SQLException { // 로그인
		String url = "https://www.ictintern.or.kr/homepage/trainingCompany/companyList.do";
		Vector<ICT> Interntext = new Vector<>();
		conn = null;
		String query = "SELECT * FROM ict2021";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2",
					"1Q2w3e4r!!");
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
		rs.close();
		stmt.close();
		conn.close();

		return Interntext;
	}

	public Vector<ICT> ICT2020하반기() throws SQLException { // 로그인
		String url = "https://www.ictintern.or.kr/homepage/trainingCompany/companyList.do";
		Vector<ICT> Interntext = new Vector<>();
		conn = null;
		String query = "SELECT * FROM ict20202";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2",
					"1Q2w3e4r!!");
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
		rs.close();
		stmt.close();
		conn.close();
		return Interntext;
	}

	public Vector<ICT> ICT2020상반기() throws SQLException { // 로그인
		String url = "https://www.ictintern.or.kr/homepage/trainingCompany/companyList.do";
		Vector<ICT> Interntext = new Vector<>();
		conn = null;
		String query = "SELECT * FROM ict20201";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2",
					"1Q2w3e4r!!");
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
		rs.close();
		stmt.close();
		conn.close();
		return Interntext;
	}

	public Vector<IPP> IPP2021하반기() throws SQLException { // 로그인
		String url = "https://ipp.mju.ac.kr/index.do";
		Vector<IPP> ipp = new Vector<>();
		conn = null;
		String query = "SELECT * FROM ipp20212";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2",
					"1Q2w3e4r!!");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				ipp.add(new IPP(rs.getString("NAME"), rs.getString("PROJECT"), rs.getString("AREA"),
						rs.getString("NUM") + "명", rs.getString("STATE"), rs.getString("period"), url));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs.close();
		stmt.close();
		conn.close();
		return ipp;
	}

	public Vector<IPP> IPP2021상반기() throws SQLException { // 로그인
		String url = "https://ipp.mju.ac.kr/index.do";
		Vector<IPP> ipp = new Vector<>();
		conn = null;
		String query = "SELECT * FROM ipp20211";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2",
					"1Q2w3e4r!!");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				ipp.add(new IPP(rs.getString("NAME"), rs.getString("PROJECT"), rs.getString("AREA"),
						rs.getString("NUM") + "명", rs.getString("STATE"), url));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs.close();
		stmt.close();
		conn.close();
		return ipp;
	}

	public Vector<IPP> IPP2020하반기() throws SQLException { // 로그인
		String url = "https://ipp.mju.ac.kr/index.do";
		Vector<IPP> ipp = new Vector<>();
		conn = null;
		String query = "SELECT * FROM ipp20202";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2",
					"1Q2w3e4r!!");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				ipp.add(new IPP(rs.getString("NAME"), rs.getString("PROJECT"), rs.getString("AREA"),
						rs.getString("NUM") + "명", rs.getString("STATE"), url));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs.close();
		stmt.close();
		conn.close();
		return ipp;
	}

	public Vector<IPP> IPP2020상반기() throws SQLException { // 로그인
		String url = "https://ipp.mju.ac.kr/index.do";
		Vector<IPP> ipp = new Vector<>();
		conn = null;
		String query = "SELECT * FROM ipp20201";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2",
					"1Q2w3e4r!!");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				ipp.add(new IPP(rs.getString("NAME"), rs.getString("PROJECT"), rs.getString("AREA"),
						rs.getString("NUM") + "명", rs.getString("STATE"), url));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs.close();
		stmt.close();
		conn.close();
		return ipp;
	}

	public Vector<IPP> IPP2019하반기() throws SQLException { // 로그인
		String url = "https://ipp.mju.ac.kr/index.do";
		Vector<IPP> ipp = new Vector<>();
		conn = null;
		String query = "SELECT * FROM ipp20192";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2",
					"1Q2w3e4r!!");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				ipp.add(new IPP(rs.getString("NAME"), rs.getString("PROJECT"), rs.getString("AREA"),
						rs.getString("NUM") + "명", rs.getString("STATE"), url));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs.close();
		stmt.close();
		conn.close();
		return ipp;
	}

	public Vector<IPP> IPP2019상반기() throws SQLException { // 로그인
		String url = "https://ipp.mju.ac.kr/index.do";
		Vector<IPP> ipp = new Vector<>();
		conn = null;
		String query = "SELECT * FROM ipp20191";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://172.30.1.45:3306/mydb?useSSL=false", "team2",
					"1Q2w3e4r!!");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				ipp.add(new IPP(rs.getString("NAME"), rs.getString("PROJECT"), rs.getString("AREA"),
						rs.getString("NUM") + "명", rs.getString("STATE"), url));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs.close();
		stmt.close();
		conn.close();
		return ipp;
	}

	public static void explore(Object temp2) throws URISyntaxException {
		try {
			Desktop.getDesktop().browse(new URI((String) temp2));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
