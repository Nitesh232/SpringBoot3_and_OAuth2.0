package com.nitesh.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
		.csrf.disable()
		.authorizeHttpRequests.anyRequest().authenticated()
		.oauth2Client.configure(http);
		
		return http.build();
	}
	
}
