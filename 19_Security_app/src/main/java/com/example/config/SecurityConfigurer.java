package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfigurer {

	   @Bean
	   public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
		  
		   http.authorizeHttpRequests((req) -> 
		    req.antMatchers("/contact").permitAll()
		    .anyRequest().authenticated()).formLogin();
		   
		   return http.build();
		   
	   }
}