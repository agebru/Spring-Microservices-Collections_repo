package com.me.coreJava.mocking;

public interface IAuthenticateUser {
	public boolean authenticateUser(String userName, String password) throws EmptyCredentialsException;
	public String getUser(int userId);
	public int add(int x, int y);
}
