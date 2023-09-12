package com.servlet.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		String url="jdbc:mysql://localhost:3306/project";
		String uname="root";
		String pass="gayu8978";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		return con;
	}

	
	}

