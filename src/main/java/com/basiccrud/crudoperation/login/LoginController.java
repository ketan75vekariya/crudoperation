package com.basiccrud.crudoperation.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	private AuthenticationService authenticationservice;
	
	
	
	public LoginController(AuthenticationService authenticationservice) {
		super();
		this.authenticationservice = authenticationservice;
	}
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		
		return "login";
	}
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String gotoWelcompage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		
		if(authenticationservice.authenticationservice(name, password)) {
			model.put("name", name);
		return "welcome";
		}
		
		model.put("errorMessage", "Invalid Username or Password please try agin");
		return "login";
	}

}
