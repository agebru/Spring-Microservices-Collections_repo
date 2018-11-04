package com.me.coreJava.mocking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class AuthenticationApplicationTest {
	
	
	private IAuthenticateUser authenticateUser;	
	
	private AuthenticatorApplication authenticator;
	
	@Test
	public void testAuthenticate() throws EmptyCredentialsException {
		
		String userName="emmanuel";
		String password="emmanuel123";
		
		IAuthenticateUser authenticatorMock = mock(IAuthenticateUser.class);
		authenticator=new AuthenticatorApplication(authenticatorMock);
		
		when(authenticatorMock.authenticateUser(userName, password)).thenReturn(true);
		
		boolean actual=authenticator.authenticate(userName, "wrongpassword");
		
		//assertTrue(actual);		
		
		assertEquals(false,actual);
		
	}
	
	@Test(expected=EmptyCredentialsException.class)
	public void testAutheticateEmptyCredentialsException() throws EmptyCredentialsException{
		
		IAuthenticateUser authenticatorMock = mock(IAuthenticateUser.class);
		authenticator=new AuthenticatorApplication(authenticatorMock);
		
		when(authenticatorMock.authenticateUser("", "")).thenThrow(new EmptyCredentialsException());
		 authenticator.authenticate("", "");
		 
		 boolean authenticate =authenticator.authenticate("", "");
		//assertFalse(authenticate);
		//assertTrue(authenticate);
		
		
	}
	
	@Test
	public void testgetUserInfo() {
		IAuthenticateUser authenticatorMock = mock(IAuthenticateUser.class);
		authenticator=new AuthenticatorApplication(authenticatorMock);
		
		when(authenticatorMock.getUser(12)).thenReturn("Emanuel");
		when(authenticatorMock.getUser(14)).thenReturn("Hagos");
		
		String actual=authenticator.getUserInfo(12);
		assertEquals("Emanuel is Awesome",actual);
		//System.out.println(actual);		
		
		//String actual2=authenticator.getUserInfo(14);
		//assertEquals("Emanuel is Awesome",actual2); // this will fail
	}
	
	@Test
	public void testAddAndDoubleNumbers() {
		IAuthenticateUser authenticatorMock = mock(IAuthenticateUser.class);
		authenticator=new AuthenticatorApplication(authenticatorMock);
		
		when(authenticatorMock.add(10, 20)).thenReturn(30);		
		int actual = authenticator.addAndDoubleNumbers(10, 20);
		assertEquals(60,actual);
		
		verify(authenticatorMock, times(1)).add(10, 20);
	  //verify(authenticatorMock).add(10,30); will fail
		
		
		
	}
	

}
