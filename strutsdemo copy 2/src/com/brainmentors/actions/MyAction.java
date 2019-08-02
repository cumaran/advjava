package com.brainmentors.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport implements SessionAware { //implements ServletRequestAware{ //implements Action {
	private String message;
	private String userid;
	private String password;
	private List<String> list = new ArrayList<>();
	private void loadList() {
		list.add("Delhi");
		list.add("Mumbai");
		
	}
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String execute() {
		this.loadList();
		this.message = "Hi Struts 2";
		//return "success";
		
		return SUCCESS;
		
	}
	public String doLogin() {
		if(userid.equals(password)) {
			message = "Welcome "+userid;
			session.put("uid", userid);
			//session.setAttribute("uid", userid);
		}
		else {
			message="invalid Userid or password";
		}
		return "ok";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	HttpSession session ;
//	@Override
//	public void setServletRequest(HttpServletRequest request) {
//		session = request.getSession(true);
//		// TODO Auto-generated method stub
//		
//	}
	Map<String, Object> session ;
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
		
	}
	
	

}
