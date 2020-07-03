package com.user.onBoarding.model;

public class UserResponse {
	
	private UserModel user;
	private String message;
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
