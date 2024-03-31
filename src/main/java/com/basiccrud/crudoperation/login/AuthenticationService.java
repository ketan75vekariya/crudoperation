package com.basiccrud.crudoperation.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticationservice(String username, String password) {
		boolean isValidUsername = username.equalsIgnoreCase("admin");
		boolean isValidPassword = password.equalsIgnoreCase("password");
		
		return isValidUsername && isValidPassword;
	}
}
