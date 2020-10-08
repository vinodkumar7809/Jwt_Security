package com.vensai.JwtSecurity.jwtRolesController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RolesController {

	
	@GetMapping("/hello-admin")
	public String helloAdmin() {
		return "hello-admin";
	}
	
	@GetMapping("/hello-user")
	public String helloUser() {
		return "hello-user";
	}
	
}
