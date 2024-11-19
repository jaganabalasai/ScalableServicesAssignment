package com.UserRegister.User_Register.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserRegister.User_Register.Model.MyAppUseRepository;
import com.UserRegister.User_Register.Model.MyAppUser;

@RestController
public class RegistrationController {
	@Autowired
	private MyAppUseRepository myAppUserRepository;
	
	@PostMapping(value="/req/signup", consumes="application/json")
	public MyAppUser createUser(@RequestBody MyAppUser user) {
		return myAppUserRepository.save(user);
		
	}

}
