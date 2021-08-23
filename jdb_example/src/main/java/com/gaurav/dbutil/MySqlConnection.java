package com.gaurav.dbutil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class MySqlConnection {
	private static Connection connection;

	private MySqlConnection() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "1234";
		connection = DriverManager.getConnection(url, username, password);
		return connection;

	}
}
