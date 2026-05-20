package javajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JdbcExample2 {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
		// 1. Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. Create Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac_rn", "root", "cdacacts");

		// 3. Create Statement
		Statement stmt = con.createStatement();

		// 4. Execute Query
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");

		ResultSetMetaData metaData = rs.getMetaData();
		
		int columnCount = metaData.getColumnCount();

		// Print column names
		for (int i = 1; i <= columnCount; i++) {
			System.out.printf("%-20s",metaData.getColumnName(i));
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");

		// Print rows
		while (rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
				System.out.printf("%-20s",rs.getString(i));
			}
			System.out.println();
		}

	}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
