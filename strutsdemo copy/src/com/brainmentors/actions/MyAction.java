package com.brainmentors.actions;

public class MyAction {
	private String message;
	private String userid;
	private String password;
	public String execute() {
		this.message = "Hi Struts 2";
		return "success";
		
	}
	public String doLogin() {
		if(userid.equals(password)) {
			message = "Welcome "+userid;
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
	
	

}
