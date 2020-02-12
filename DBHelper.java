package helper;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Connection;

public class DBHelper {

	public static Connection getConnection() {
		Properties connectionProperties = new Properties();
		connectionProperties.put("user", "root");
		connectionProperties.put("password", "Farcanea13!");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		String connString = "jdbc:mysql://localhost:3306/restaurant";
		try {
			Connection con = (Connection) DriverManager.getConnection(connString, connectionProperties);
			System.out.println("Conexiunea la baza de date a fost deschisa");
			return con;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	public static void closeConnection(java.sql.Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
