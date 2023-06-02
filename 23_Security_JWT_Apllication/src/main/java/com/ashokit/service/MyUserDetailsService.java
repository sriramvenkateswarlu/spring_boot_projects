package com.ashokit.service;

import java.util.ArrayList;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		return new User("admin","$2a$12$z/eKR8s53VyNhAg6lm7NxOzO/wSNcWJYLeDt24yakuWJ3UZnI0Eem",new ArrayList<>() );
		
	}
	

}
