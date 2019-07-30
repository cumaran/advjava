package com.brainmentors.todolist.utils;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordHash {
	
	public static void main(String[] args) {
		String password = "1234";
		String salt = BCrypt.gensalt(10);
		String hash = BCrypt.hashpw(password, salt);
		System.out.println(hash);
		if(BCrypt.checkpw("jkhdrjg", hash)) {
			System.out.println("Compare");
		}
		else {
			System.out.println("Not Compare");
		}
		
		
	}

}
