package com.me.coreJava.mocking;

public class AuthenticatorApplication {

	private IAuthenticateUser authenticateUser;

	public AuthenticatorApplication(IAuthenticateUser authenticateUser) {
		this.authenticateUser = authenticateUser;
	}

	public boolean authenticate(String userName, String password) throws EmptyCredentialsException {// what we want to test is this method

		boolean authenticated;

		authenticated = this.authenticateUser.authenticateUser(userName, password);// We dont want to test this method.
		return authenticated;
	}

	public String getUserInfo(int userId) {
		String user = authenticateUser.getUser(userId);
		StringBuilder sb = new StringBuilder();
		sb.append(user).append(" is Awesome");
		return sb.toString();

	}

	public int addAndDoubleNumbers(int x, int y) {
		int add = authenticateUser.add(x, y);
		int doubledSum = add * 2;
		return doubledSum;

	}

}
