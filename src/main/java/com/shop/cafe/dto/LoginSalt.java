package com.shop.cafe.dto;

public class LoginSalt {
	
	private String email,salt;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public LoginSalt(String email, String salt) {
		super();
		this.email = email;
		this.salt = salt;
	}

	public LoginSalt() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LoginSalt [email=" + email + ", salt=" + salt + "]";
	}
	
	
	
	

}
