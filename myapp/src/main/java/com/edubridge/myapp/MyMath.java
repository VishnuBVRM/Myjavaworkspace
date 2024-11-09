package com.edubridge.myapp;

public class MyMath {
	String username = "admin";
	String password = "admin@12345";
	
	public boolean isEven(int num) {
		return num%2 == 0;
	}
	
	public boolean authenticate (String username, String password) {
		if(username.equals(username) && password.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
}
