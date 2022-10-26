package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class JDBCReview {//This is the example for deleting particular row or rows at once since "where" clause is used in the sql query...

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohart20", "root", "1234");

		PreparedStatement pstmt = conn.prepareStatement("select * from candidate");

		ResultSet rs = pstmt.executeQuery();

		while(rs.next()) {

			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));	

		}


	}
}
