package com.learn.springjpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcSQLServerDriverUrlExample {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			// the sql server driver string
			// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// the sql server url
			String url = "jdbc:sqlserver://DESKTOP-0SP81J5\\SQLEXPRESS;instance=SQLEXPRESS;databaseName=Learn_ex;";

			// get the sql server database connection
			connection = DriverManager.getConnection(url, "learn", "learn");
			System.out.println("Got connection");

			// now do whatever you want to do with the connection
			// ...

		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(2);
		}
	}
}