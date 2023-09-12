package com.servlet.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Queryprac {
	public int insert(String FirstName,String LastName,String UserName,String Password,String Address,String ContactNo) throws ClassNotFoundException, SQLException {
		JDBConnection jd=new JDBConnection();
		Connection con=jd.getConnection();
		Statement st=con.createStatement();	
		String qry="insert into registerpage values('"+FirstName+"','"+LastName+"','"+UserName+"','"+ Password+"','"+ Address+"','"+ ContactNo+"');";
		int count=st.executeUpdate(qry);
		return count;
		}

}
