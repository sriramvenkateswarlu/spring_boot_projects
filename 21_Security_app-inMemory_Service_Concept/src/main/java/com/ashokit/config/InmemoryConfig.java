package com.ashokit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class InmemoryConfig {
	@Autowired
	private UserDetailsService service;
     
	// this method used only for practice not use for realtime
/*	@Bean
	public InMemoryUserDetailsManager configure() {
		
		UserDetails adminUser=User.withDefaultPasswordEncoder()
				                                     .username("venky")
				                                     .password("venky@123")
				                                     .authorities("ADMIN")
				                                     .build();
	UserDetails normalUser=User.withDefaultPasswordEncoder()
			                                   .username("sriram")
			                                   .password("sriram@123")
			                                   .authorities("USER")
        	                                   .build();

	return new InMemoryUserDetailsManager(adminUser,normalUser);
	}
	*/
	
	// constructor injection
	@Autowired  
	public void configutre(AuthenticationManagerBuilder auth) throws Exception {
		 auth.userDetailsService(service)
		                    .passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	// this method used for filter the security for based on method(like url)
	@Bean
	public SecurityFilterChain security(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((req)->
		                     req.antMatchers("/contact").permitAll()
		                            .anyRequest().authenticated()
		                            ).formLogin();
		return http.build();
		
	}
}
