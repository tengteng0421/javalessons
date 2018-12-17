package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JavaJDBCTest {

	static String driver = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://127.0.0.1:3306/gqmd?useUnicode=true&amp;characterEncoding=utf8";
	static String username = "root";
	static String password = "";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("con run");
		PreparedStatement ps = con.prepareStatement("select * from auth_user");
		System.out.println("ps run");
		ResultSet rs = ps.executeQuery();
		System.out.println("rs run");
		System.out.println("rs: " + rs.toString());
		while (rs.next()) {
			int row = rs.getRow();
			System.out.println("row " + row);
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		rs.close();
		ps.close();
		con.close();
	}
}
