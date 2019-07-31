package com.brainmentors.todolist.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public interface CommonDAO {
	static String getJNDI() {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		return rb.getString("jndi");
	}
	 static Connection getConnection() throws ClassNotFoundException, SQLException, NamingException {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = null;
		InitialContext initContext = new InitialContext();
		Context context = (Context) initContext.lookup("java:comp/env");
		DataSource dataSource = (DataSource)context.lookup(getJNDI());
		con = dataSource.getConnection();
		//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todoapp","root","amit123456");
		if(con!=null) {
			System.out.println("Connnection Created.");
			//con.close();
		}
		else {
			System.out.println("Not Created.");
		}
		return con;
	}
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		CommonDAO.getConnection();
//	}

}
