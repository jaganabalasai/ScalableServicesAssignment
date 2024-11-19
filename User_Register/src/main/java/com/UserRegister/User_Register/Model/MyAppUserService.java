package com.UserRegister.User_Register.Model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MyAppUserService implements UserDetailsService{
	
	@Autowired
	private MyAppUseRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyAppUser> user= repository.findByUsername(username);
		if(user.isPresent()) {
			var userobj =user.get();
			return User.builder().username(userobj.getUsername()).password(userobj.getPassword()).build();
		} else {
			throw new UsernameNotFoundException(username);
		}
	
	}
}
