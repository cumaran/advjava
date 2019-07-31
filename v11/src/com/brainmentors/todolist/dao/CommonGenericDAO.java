package com.brainmentors.todolist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.brainmentors.todolist.dto.CommonGenericDTO;

public interface CommonGenericDAO {
	public static ArrayList getByKey(String key) throws SQLException, ClassNotFoundException, NamingException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<CommonGenericDTO> list = new ArrayList<>();
		try {
			con = CommonDAO.getConnection();
			pstmt= con.prepareStatement("select val, descr from common_generic_params where ckey=?" );
			pstmt.setString(1, key);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CommonGenericDTO common = new CommonGenericDTO();
				common.setKey(key);
				common.setVal(rs.getString("val"));
				common.setDesc(rs.getString("descr"));
				list.add(common);
			}
		}
		finally {
			if(rs!=null) {
				rs.close();
				
			}
			if(pstmt!=null) {
				pstmt.close();
			}
		}
		return list;
	}

}
