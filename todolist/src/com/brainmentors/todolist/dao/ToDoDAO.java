package com.brainmentors.todolist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

public interface ToDoDAO {
	public static  String  register(String userid, String pwd) throws ClassNotFoundException, SQLException, NamingException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String msg ="Unable to Register";
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("insert into user_mst (userid, pwd) values(?,?)");
		pstmt.setString(1, userid);
		pstmt.setString(2, pwd);
		int recordCount = pstmt.executeUpdate();
		if(recordCount>0) {
			msg = "Register SuccessFully";
		}
		
		//rs.close();
		pstmt.close();
		//con.close();
		return msg;
	}
public static  String  login(String userid, String pwd) throws ClassNotFoundException, SQLException, NamingException {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String msg =null;
	con = CommonDAO.getConnection();
	pstmt = con.prepareStatement("select userid, pwd "
			+ "from user_mst where userid=? and pwd=?");
	pstmt.setString(1, userid);
	pstmt.setString(2, pwd);
	rs = pstmt.executeQuery();
	if(rs.next()) {
		msg = userid;
	}
	rs.close();
	pstmt.close();
	//con.close();
	return msg;
}
//public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	//System.out.println(ToDoDAO.register("tom", "4343"));
//	System.out.println(ToDoDAO.login("ram", "gdfgfgdfgd"));
//}
}
