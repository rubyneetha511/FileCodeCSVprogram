package com.javacode.ex;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

			
public class DBConnection {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		 Class.forName("com.mysql.jdbc.Driver");

		Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jcg", "root",
				"Neetha123");

		return connection;
	}

	public static void main(String[] args) {
		try {
			getConnection();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
